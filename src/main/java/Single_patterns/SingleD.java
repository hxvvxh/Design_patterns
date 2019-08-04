package Single_patterns;

import Pojo.hp;
/**
 * 枚举单例模式
 * JVM会保证枚举类构造方法绝对只调用一次，所以保证了对象实例的唯一性
 * 因为java在定义枚举类是就确定了枚举类必须为单例。所以在枚举单例必定是单例的，不会有所谓的线程安全问题
 * 
 * ******最好的实现单例模式的方法：没有之一**********
 * 
 * 之前上述的方法所存在的缺陷都会被完美的解决
 * @author Administrator
 *
 */
public class SingleD {
	/**
	 * 内部枚举类形式
	 * (1)1.构造方法中实例化对象
	 */
	private SingleD() {}
	public static SingleD   getInstance() {
		return Singleton.INSTANCE.getInstance();
	}
	
	public static SingleD   getInstance2() {
		return Singleton2.INSTANCE.getInstance();
	}
	
	public static hp getInstance3() {
		//属性1
		Singleton3.INSTANCE.doThings();
		//属性2
//		Singleton3.INSTANCE.String_ID;
		//最重要的属性
		return Singleton3.INSTANCE.getInstance();
	}
	
	private enum Singleton{
		INSTANCE;
		private SingleD Singled;
		Singleton(){
			Singled= new SingleD(); 
		}
		public SingleD getInstance() {
			return Singled;
		}
	}
	/**
	 * 内部枚举类形式
	 * 2.枚举常量的值即为对象实例
	 */
	private enum Singleton2{
		INSTANCE(new SingleD());
		private SingleD Singled;
		Singleton2(SingleD single){
			this.Singled=single;
		}
		public SingleD getInstance() {
			return Singled;
		}
	}

	/**
	 * 枚举单例的一般实现方法-比上述要简单但是应用场景小
	 * @author Administrator
	 *
	 */
	private enum Singleton3{
		INSTANCE;
	    private String value;
          
	    private static final String String_ID="hanpeng";
	    
	    private hp h;
	    private Singleton3() {
	    	h=new hp();
	    }
	    
	    public static final hp getInstance() {
	    	//这个是可以的，只是为了方便写在了这个了类里导致报错 先用null代替
//	    	return this.h;
	    	return null;
	    }
	    
	    public String getValue() {
	        return value;
	    }

	    public void setValue(String value) {
	        this.value = value;
	    }

	    public void doThings() {
	        System.out.println("do method");
	    }
	}

}
