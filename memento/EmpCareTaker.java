package memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class EmpCareTaker {
	
	
	final Deque<EmpMemento> mementos = new ArrayDeque();
	
	public EmpMemento getMemento() {
		EmpMemento emp = mementos.pop();
		
		return emp;
	}
	
	
	public void addMemento(EmpMemento memento) {
		mementos.push(memento);
	}

}
