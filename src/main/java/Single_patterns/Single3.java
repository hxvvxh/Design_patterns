package Single_patterns;
/**
 * 简单单例3
 * 第一个if (instance == null)，其实是为了解决Version2中的效率问题，只有instance为null的时候，
 *    才进入synchronized的代码段大大减少了几率。
　　第二个if (instance == null)，则是跟Version2一样，是为了防止可能出现多个实例的情况。
 * @author Administrator
 *
 */
public class Single3 {
    private static Single3 instance;
    private Single3() {}
    public static Single3 getInstance() {
        if (instance == null) {
            synchronized (Single3.class) {
                if (instance == null) {
                    instance = new Single3();
                }
            }
        }
        return instance;
    }
     //TODO 请看说明
    /**
     * 事实上在 JVM 中这句话大概做了下面 3 件事情。
　          　1. 给 singleton 分配内存
　　          2. 调用 Singleton 的构造函数来初始化成员变量，形成实例
　　          3. 将singleton对象指向分配的内存空间（执行完这步 singleton才是非 null 了）但是在 JVM 的即时编译器中存在指令重排序的优化。
     */
    /**
     * 也就是说上面的第二步和第三步的顺序是不能保证的，
     * 最终的执行顺序可能是 1-2-3 也可能是 1-3-2。
     * 如果是后者，则在 3 执行完毕、2 未执行之前，被线程二抢占了，这时 instance 已经是非 null 了（但却没有初始化），
     * 所以线程二会直接返回 instance，然后使用，然后顺理成章地报错。
     */
    /**
     * 由于有一个『instance已经不为null但是仍没有完成初始化』的中间状态，
     * 而这个时候，如果有其他线程刚好运行到第一层if (instance == null)这里，
     * 这里读取到的instance已经不为null了，所以就直接把这个中间状态的instance拿去用了，就会产生问题。
     */
    
    
    
    
    
    
    
    
    
    
    
    
}
