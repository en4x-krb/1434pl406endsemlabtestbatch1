
public class AC implements Has{

	private boolean acState=false; //AC is OFF
	@Override
	public void on() {
		System.out.println("AC is turned On");
		acState = true;
	}

	@Override
	public void off() {
		System.out.println("AC is turned Off");	
		acState=false;
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
	
	public boolean getACState() {
		return acState;
	}

}
