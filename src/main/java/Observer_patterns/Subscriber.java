package Observer_patterns;

/**
 * 订阅者接口（观察者 ）
 * @author Administrator
 *
 */
public interface Subscriber {

	int receive(String publisher,String  artcleName);
}
