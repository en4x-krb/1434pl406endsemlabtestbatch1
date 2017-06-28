
public class TV implements Has{
	private boolean tvState=false; //TV is OFF
	private int vol;
	private int channel;
	private final int maxChannel;
	private final int maxVol;
	public TV() {
		vol=10;
		channel=1;
		maxChannel=300;
		maxVol=100;
	}
	@Override
	public void on() {
		tvState=true;
		System.out.printf("TV is turned On\n");
	}

	@Override
	public void off() {
		tvState=false;
		System.out.printf("TV is turned On\n");
	}
	
	public void chup() {
		if(++channel>=maxChannel)
			channel=1;
		System.out.printf("Switching to next channel %d\n",channel);
	}
	
	public void chdw() {
		if(--channel<=1)
			channel=300;
		System.out.printf("Switching to previous channel %d\n",channel);
	}
	
	public void volup() {
		if(++vol>=maxVol)
			vol=maxVol;
		System.out.printf("Volume Increased, Vol : %d\n",vol);
	}
	
	public void voldw() {
		if(--vol<=0) 
			vol=0;
		System.out.printf("Volume Decreased, Vol : %d\n",vol);
	}
	
	public int getVol() {
		return vol;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public boolean getState() {
		return tvState;
	}

}
