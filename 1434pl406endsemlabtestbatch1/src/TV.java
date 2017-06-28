
public class TV implements Has{
	private int vol;
	private int channel;
	public TV() {
		vol=10;
		channel=1;
	}
	@Override
	public void on() {
		System.out.printf("TV is turned On\n");
	}

	@Override
	public void off() {
		System.out.printf("TV is turned On\n");
	}
	
	public void chup() {
		this.channel++;
		System.out.printf("Switching to next channel %d\n",channel);
	}
	
	public void chdw() {
		this.channel--;
		System.out.printf("Switching to previous channel %d\n",channel);
	}
	
	public void volup() {
		this.vol++;
		System.out.printf("Volume Increased, Vol : %d\n",vol);
	}
	
	public void voldw() {
		this.vol--;
		System.out.printf("Volume Decreased, Vol : %d\n",vol);
	}

}
