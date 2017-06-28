//import java.util.Scanner;
public class HomeOwner {

	public static void main(String[] args) {
		HasFactory HAS = new HasFactory();
		
		
		/*Scanner userInp = new Scanner(System.in);
		int input;
		do {
			input = userInp.nextInt();
			System.out.println("\n1 - TV,2 for AC,3 for HomeLights,4 to exit:");
			System.out.println("Enter your Choice"); 
		} while(input!=0);
		*/
		
		
		
		Has tv = HAS.getAppliances("TV");
		tv.on();
		tv.chup();
		tv.chdw();
		tv.volup();
		tv.volup();
		tv.voldw();
		
		Has ac = HAS.getAppliances("AC");
		ac.on();
		ac.off();
		
		Has as = HAS.getAppliances("AUDIO SYSTEM");
		as.on();
		as.off();
		
		Has light = HAS.getAppliances("LIGHT");
		light.on();
		light.off();
		
		Has washmachine = HAS.getAppliances("WASHING MACHINE");
		washmachine.on();
		washmachine.off();
		
		entersHome(HAS);
		
	}
	
	private static void entersHome(HasFactory has) {
		Has tv = has.getAppliances("TV");
		Has ac = has.getAppliances("AC");
		Has light = has.getAppliances("LIGHT");
		
		tv.on();
		ac.on();
		light.on();
	}

}
 