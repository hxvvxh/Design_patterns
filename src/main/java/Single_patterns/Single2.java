package Single_patterns;
/**
 * 简单单例2
 * 加上synchronized关键字之后，getInstance方法就会锁上了
 * 那么多线程同步的时候就只会获取这一个实例
 * 给getInstance方法加锁，虽然会避免了可能会出现的多个实例问题，
 * 但是会强制除T1之外的所有线程等待，实际上会对程序的执行效率造成负面影响。
 * 
 * @author Administrator
 *
 */
public class Single2 {
	private static Single2 instance;
    private Single2() {}
    public static synchronized Single2 getInstance() {
        if (instance == null) {
            instance = new Single2();
        } 
       return instance;
    }
}
