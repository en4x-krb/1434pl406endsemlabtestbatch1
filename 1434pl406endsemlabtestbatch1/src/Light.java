
public class Light implements Has{
	private boolean lightState =false; //Default light is OFF
	@Override
	public void on() {
		lightState=true;
		System.out.println("Light is turned On");
	}

	@Override
	public void off() {
		lightState=false;
		System.out.println("Light is turned off");
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
	
	public boolean getLightState() {
		return lightState;
	}
}
