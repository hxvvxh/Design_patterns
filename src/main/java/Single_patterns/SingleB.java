package Single_patterns;

/**
 * 饿汉式单例
 * 什么是饿汉式单例：指在全局的单例实例在类装载的时候就已经创建 
 * 但是由于程序员是无法指定类加载器的加载顺序的 所以在控制方面是存在问题的
 * 还有一点就是初始化的早，可能会导致资源的浪费
 * 饿汉式单例的好处在于  可以大部分解决多线程带来的问题      因为在启动时就会初始化全局的静态变量就会初始化这个类
 * @author Administrator
 *
 */
public class SingleB {
	private static final SingleB INSTANCE = new SingleB();

	private SingleB() {
	}

	public static SingleB getInstance() {
		return INSTANCE;
	}

}
