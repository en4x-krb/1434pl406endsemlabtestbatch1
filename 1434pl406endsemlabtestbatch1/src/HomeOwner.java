
public class HomeOwner {

	public static void main(String[] args) {
		HasFactory HAS = new HasFactory();
		
		entersHome(HAS);
		
		Has tv = HAS.control("TV");
		Has ac = HAS.control("AC");
		Has as = HAS.control("AUDIO SYSTEM");
		Has light = HAS.control("LIGHT");
		Has washmachine = HAS.control("WASHING MACHINE");


		tv.on();
		tv.chup();
		tv.chdw();
		tv.volup();
		tv.volup();
		tv.voldw();
		
		ac.on();
		
		as.on();
		
		light.off();
		light.on();
		light.on();
		light.off();
		
		washmachine.on();
		
	}
	
	private static void entersHome(HasFactory has) {
		Has tv = has.control("TV");
		Has ac = has.control("AC");
		Has light = has.control("LIGHT");
		
		tv.on();
		ac.on();
		light.on();
	}

}
 