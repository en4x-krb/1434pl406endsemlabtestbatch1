
public class WashMachine implements Has{

	private boolean washMachineState=false; //Washing Machine is OFF
	@Override
	public void on() {
		washMachineState=true;
		System.out.println("Washing Machine is turned On");
		
	}

	@Override
	public void off() {
		washMachineState=false;
		System.out.println("Washing Machine is turned Off");
		
	}

	@Override
	public void chup() {
		//Do Nothing
		
	}

	@Override
	public void chdw() {
		//Do Nothing
		
	}

	@Override
	public void volup() {
		//Do Nothing
		
	}

	@Override
	public void voldw() {
		//Do Nothing
		
	}
	
	public boolean getState() {
		return washMachineState;
	}

}
