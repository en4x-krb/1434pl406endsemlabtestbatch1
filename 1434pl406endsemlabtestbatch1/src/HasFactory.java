
public class HasFactory {
	public Has getAppliances(String applianceType) {
		if(applianceType == null)
			return null;
		
		if(applianceType.equalsIgnoreCase("LIGHT"))
			return new Light();
		else if(applianceType.equalsIgnoreCase("AC"))
			return new AC();
		else if(applianceType.equalsIgnoreCase("TV"))
			return new TV();
		else if(applianceType.equalsIgnoreCase("AUDIO SYSTEM"))
			return new AudioSystem();
		else if(applianceType.equalsIgnoreCase("WASHING MACHINE"))
			return new WashMachine();
		
		return null;
	}
	
	public void enterHome() {
		
	}
}
