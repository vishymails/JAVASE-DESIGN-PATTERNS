package observer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyTopic topic = new MyTopic();
		
		Observer obj1 = new MyTopicSubscriber("user1");
		Observer obj2 = new MyTopicSubscriber("user2");
		Observer obj3 = new MyTopicSubscriber("user3");
		Observer obj4 = new MyTopicSubscriber("user4");
		
		
		topic.register(obj1);
		topic.register(obj2);
		topic.register(obj3);
		topic.register(obj4);
		
		obj1.setSubject(topic);
		obj2.setSubject(topic);
		obj3.setSubject(topic);
		obj4.setSubject(topic);
		
		
		obj1.update();
		
		topic.postMessage("New Message ");
	}

}
