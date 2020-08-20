package memento;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpOriginator empOriginator = new EmpOriginator(100,"Sonu Kumar" , "2121212121", "Developer");
		
		EmpMemento empMemento = empOriginator.saveToMemento();
		
		EmpCareTaker empCareTaker = new EmpCareTaker();
		
		empCareTaker.addMemento(empMemento);
		
		System.out.println("Original Object ");
		
		empOriginator.printInfo();
		
		System.out.println("----------------------------------");
		
		
		System.out.println("Update phone number ");
		
		empOriginator.setEmpPhoneNo("11111111111");
		
		empMemento = empOriginator.saveToMemento();
		
		empCareTaker.addMemento(empMemento);
		
		empOriginator.printInfo();
		
		System.out.println("----------------------------------");
		
		System.out.println("Update Designation ");
		
		empOriginator.setEmpDesignation("Architect");
		
		empMemento = empOriginator.saveToMemento();
		
		empCareTaker.addMemento(empMemento);
		
		empOriginator.printInfo();
		
		
		System.out.println("----------------------------------");
		
		
		
		System.out.println("Undo Operation base");
		
		
		empMemento = empCareTaker.getMemento();
		
		
		empOriginator.undoFromMemento(empMemento);
		
		empOriginator.printInfo();
		
		System.out.println("----------------------------------");
		
		System.out.println("Undo Operation step back 1");  
        empMemento = empCareTaker.getMemento();
		
		
		empOriginator.undoFromMemento(empMemento);
		empOriginator.printInfo();
		
		
		System.out.println("----------------------------------");
		
		
		System.out.println("Undo Operation step back 2");
		
		
		  empMemento = empCareTaker.getMemento();
			
			
			empOriginator.undoFromMemento(empMemento);
			empOriginator.printInfo();
			
			
			System.out.println("----------------------------------");
		
	}

}
