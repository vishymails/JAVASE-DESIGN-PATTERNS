package state;

public class TVRemoteTest {
	
	
	private String state = "";
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void doAction() {
		if(state.equalsIgnoreCase("ON" )) {
			System.out.println("TV is turned ON");
		}else if (state.equalsIgnoreCase("OFF" )) {
			System.out.println("TV is turned OFF");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TVRemoteTest remote = new TVRemoteTest();
		
		remote.setState("ON");
		remote.doAction();
		
		
		remote.setState("OFF");
		remote.doAction();
		
	}

}
