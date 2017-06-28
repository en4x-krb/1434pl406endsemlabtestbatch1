
public class Light implements Has{

	@Override
	public void on() {
		System.out.println("Light is turned On");
	}

	@Override
	public void off() {
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

}
