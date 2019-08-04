package Single_patterns;
/**
 * 简单单例模式的最终版
 * 给instance的声明加上volatile关键字即可，
 * volatile关键字的一个作用是禁止指令重排，把instance声明为volatile之后，
 * 对它的写操作就会有一个内存屏障（什么是内存屏障？），这样，在它的赋值完成之前，就不用会调用读操作。
 * @author Administrator
 *
 */
public class Single4 {
	private static volatile Single4 instance;
    private Single4() {}
    public static Single4 getInstance() {
        if (instance == null) {
            synchronized (Single4.class) {
                if (instance == null) {
                    instance = new Single4();
                } 
           }
        } 
       return instance;
    }
}
