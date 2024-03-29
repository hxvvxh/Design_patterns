package Observer_patterns;

public class Test {
public static void main(String[] args) {
	//目标
	WeChatAccounts accounts=new WeChatAccounts("小旋锋");
	//观察者
	WeChatClient  user1=new WeChatClient("张三");
	WeChatClient  user2=new WeChatClient("李四");
	WeChatClient  user3=new WeChatClient("王五");
	
	//为目标类添加 订阅者（观察者）
	accounts.subscribe(user1);
	accounts.subscribe(user2);
	accounts.subscribe(user3);
	
	//发布消息
	accounts.publishArticles("设计模式 | 观察者模式及典型应用", "观察者模式的内容...");
	
	//删除 订阅者1
	accounts.unsubscribe(user1);
	
	//发布消息
	accounts.publishArticles("设计模式 | 观察者模式及典型应用", "单例模式的内容...");
	
}
}
