package state;

public class TVRemote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TVContext ctx = new TVContext();
		
		State start = new TVStartState();
		State stop =  new TVStopState();
		
		
		ctx.setTvState(start);
		ctx.doAction();
		
		ctx.setTvState(stop);
		ctx.doAction();
		
	}

}
