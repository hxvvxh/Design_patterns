package Flyweight_patterns;

//抽象类如果定义了有参的构造函数 则在子类中必须显性的重写父类的构造方法
//同理在抽象类定义了抽象方法 则子类中也必须重写此方法
public class ConcreteFlyweight extends Flyweight {
	// 接受外部状态
	public ConcreteFlyweight(String _Extrinsic) {
		super(_Extrinsic);
		// TODO Auto-generated constructor stub
	}

	// 根据外部状态进行逻辑处理
	@Override
	public void operate() {
		// TODO Auto-generated method stub
		// 业务逻辑
	}
}
