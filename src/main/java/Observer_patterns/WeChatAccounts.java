package Observer_patterns;
/**
 * 微信公众号类（具体目标）
 * @author Administrator
 *
 */
public class WeChatAccounts extends Publisher {

	private String name;
	
	public WeChatAccounts(String name) {
		this.name=name;
	}
	
	public void publishArticles(String artickeName,String content) {
		
		System.out.println(String.format("\n<%s>微信公众号 发布了一篇推送，文章名称为 <%s>，内容为 <%s> ",
				                         this.name,
				                         artickeName,
				                         content));
		setPubStatus();
		notifySubscriber(this.name, artickeName);
	}
}
