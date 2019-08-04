package Single_patterns;
/**
 * 单例模式 1
 * 每次获取instance之前先进行判断，
 * 如果instance为空就new一个出来，否则就直接返回已存在的instance。
 * 这种写法在大多数的时候也是没问题的。
 * 问题在于，当多线程工作的时候，如果有多个线程同时运行到if (instance == null)，都判断为null，
 * 那么两个线程就各自会创建一个实例——这样一来，就不是单例了。
 * @author Administrator
 *
 */

public class Single1 {
	private static Single1 instance;
    private Single1() {}
    public static Single1 getInstance() {
        if (instance == null) {
            instance = new Single1();
        }
        return instance;
    }
}
