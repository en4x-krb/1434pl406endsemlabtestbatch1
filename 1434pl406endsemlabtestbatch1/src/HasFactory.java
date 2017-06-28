
public class HasFactory {
	public Has control(String appType) {
		if(appType == null)
			return null;
		
		if(appType.equalsIgnoreCase("LIGHT"))
			return new Light();
		else if(appType.equalsIgnoreCase("AC"))
			return new AC();
		else if(appType.equalsIgnoreCase("TV"))
			return new TV();
		else if(appType.equalsIgnoreCase("AUDIO SYSTEM"))
			return new AudioSystem();
		else if(appType.equalsIgnoreCase("WASHING MACHINE"))
			return new WashMachine();
		
		return null;
	}
	
	public void enterHome() {
		
	}
}
