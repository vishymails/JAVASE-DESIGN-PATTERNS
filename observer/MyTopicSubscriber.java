package observer;

public class MyTopicSubscriber implements Observer {

	
	private String name ;
	
	private Subject topic;
	
	
	
	public MyTopicSubscriber(String name) {
		
		this.name = name;
	}

	
	@Override
	public void setSubject(Subject sub) {
		// TODO Auto-generated method stub

		this.topic = sub;
	}

	
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		String msg = (String) topic.getUpdate(this);
		
		if(msg == null) {
			System.out.println(name + "no messages ");
		}else 
			System.out.println(name + " consuming message : " + msg);
	}

	
}
