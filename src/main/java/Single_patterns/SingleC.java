package Single_patterns;

/**
 * 使用静态内部类来获取单例
 * 这也是个饿汉式的单例
 * 这种写法的巧妙之处在与：
 *     静态内部类是一个饿汉式的单例实现 在SingCHolder初始化的时候会有ClassLoder来保持同步 使INVAER成为一个真单例
 * 同时，由于SingletonHolder是一个内部类，只在外部类的Singleton的getInstance()中被使用，
 * 所以它被加载的时机也就是在getInstance()方法第一次被调用的时候。
 * 
 * 它利用了ClassLoader来保证了同步，同时又能让开发者控制类加载的时机。
 * 从内部看是一个饿汉式的单例，但是从外部看来，又的确是懒汉式的实现**
 * 
 * 
 * 《Effective Java》 书中推荐的写法
 * @author Administrator
 *
 */
public class SingleC {

	private static class SingCHolder{
		private static final SingleC INVAER=new SingleC();
		
	}
	
	public static final SingleC getInstance() {
		return SingCHolder.INVAER;
	}
}
