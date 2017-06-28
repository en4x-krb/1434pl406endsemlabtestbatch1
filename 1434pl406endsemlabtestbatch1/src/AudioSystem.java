
public class AudioSystem implements Has{
	private boolean asState=false; //Audio System is OFF
	@Override
	public void on() {
		asState=true;
		System.out.println("Audio System is turned on");
	}

	@Override
	public void off() {
		asState=false;
		System.out.println("Audio System is turned off");
		
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
	
	public boolean getASState() {
		return asState;
	}

}
