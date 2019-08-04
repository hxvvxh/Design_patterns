package Observer_patterns;
/**
 * 具体观察者
 * @author Administrator
 *
 */
public class WeChatClient implements Subscriber{

	public String username;
	
	public WeChatClient(String username) {
		this.username=username;
	}
	
	@Override
	public int receive(String publisher, String artcleName) {
		//接收到推送时的操作
		System.out.println(String.format("用户<%s> 接收到 <%s>微信公众号 的推送，文章标题为 <%s>", 
				                         username,
				                         publisher,
				                         artcleName));
		return 0;
	}

}
