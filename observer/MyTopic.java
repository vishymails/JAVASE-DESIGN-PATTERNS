package observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

	
	private List<Observer> observers;
	private String message;
	private boolean changed;
	
	private final Object MUTEX = new Object();
	
	public MyTopic() {
		this.observers = new ArrayList();
	}
	
	
	
	
	
	@Override
	public void register(Observer obj) {
		// TODO Auto-generated method stub

		if(obj == null)
			throw new NullPointerException("Null Observer Object");
		
		synchronized (MUTEX) {
			if(!observers.contains(obj))
				observers.add(obj);
		}
	}

	
	
	@Override
	public void unRegister(Observer obj) {
		// TODO Auto-generated method stub
		synchronized (MUTEX) {
			observers.remove(obj);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		List<Observer> observersLocal = null;
		synchronized (MUTEX) { 
			if(!changed) 
				return;
			
			observersLocal = new ArrayList(this.observers);
			this.changed = false;
		}
		
		for(Observer obj : observersLocal) {
			obj.update();
		}
		
	}

	@Override
	public Object getUpdate(Observer obj) {
		// TODO Auto-generated method stub
		return this.message;
	}
	
	public void postMessage(String msg)
	{
		System.out.println("Message posted");
		
		this.message = msg;
		
		this.changed = true;
		
		notifyObservers();
		
	}

}
