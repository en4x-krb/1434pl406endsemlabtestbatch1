
public class TV implements Has{
	private int vol=10;
	@Override
	public void on() {
		System.out.println("TV is turned On");
	}

	@Override
	public void off() {
		System.out.println("TV is turned On");
	}
	
	public void chup() {
		System.out.println("Switching to next channel");
	}
	
	public void chdw() {
		System.out.println("Switching to previous channel");
	}
	
	public void volup() {
		System.out.println("Volume Increased");
		vol++;
	}
	
	public void voldw() {
		System.out.println("Volume Decreased");
		vol--;
	}

}
