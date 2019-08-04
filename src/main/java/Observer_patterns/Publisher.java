package Observer_patterns;

import java.util.ArrayList;
import java.util.List;
/**
 * 发布者类
 * @author Administrator
 *
 */
public class Publisher {

	//定义发布者所有的观察接口
	private List<Subscriber> subscriber;
	
	//设置是否发布标示
	private boolean pubStatus= false;
	
	//在初始化发布者时就将所需的观察接口创建
	public Publisher() {
		subscriber=new ArrayList();
	}
	
	//定义添加观察接口操作
	protected void subscribe(Subscriber s) {
		this.subscriber.add(s);
	}

	//定义删除观察接口操作
	protected void unsubscribe(Subscriber s) {
		if(this.subscriber.contains(s)) {
			this.subscriber.remove(s);
		}
	}
	
	//定义推送通知
	protected void notifySubscriber(String  publisher,String articleName) {
		
		if(!this.pubStatus) {
			return;
		}
		//发布推送
		for(Subscriber s:this.subscriber) {
			s.receive(publisher, articleName);
		}
		
		//推送后将标示置为false
		this.clearPubStatus();
	}
	
	//设置推送 
	public void setPubStatus() {
		this.pubStatus=true;
	}

	//清除推送
	public void clearPubStatus() {
		this.pubStatus=false;
	}
	
	
	
	
	
	
	
	
	
}











