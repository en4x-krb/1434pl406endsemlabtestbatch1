import java.util.Scanner;
public class HomeOwner {

	public static void main(String[] args) {
		HasFactory HAS = new HasFactory();
		
		
		Scanner userInp = new Scanner(System.in);
		int menu,submenu;
		Has light = HAS.getAppliances("LIGHT");
		Has ac = HAS.getAppliances("AC");
		Has washmachine = HAS.getAppliances("WASHING MACHINE");
		Has tv = HAS.getAppliances("TV");
		Has as = HAS.getAppliances("AUDIO SYSTEM");
		boolean HASon=true;
		
		while(HASon) {
			
			System.out.println("\n 1] - Light\n 2] - AC\n 3] - Washing Machine \n 4] - TV\n 5] - Audio System\n 0] - Exit:");
			menu = userInp.nextInt();
			switch(menu) {
			case 1:
				if(light.getState()==false) {
					System.out.println("\n 1] - Turn Light On\n 0] - Main Menu");
					submenu = userInp.nextInt();
					switch(submenu) {
					case 1:
						light.on();
						break;
					}
					
				}
				else {
					System.out.println("\n 1] - Turn Light Off\n 0] - Main Menu");
					submenu = userInp.nextInt();
					switch(submenu) {
					case 1:
						light.off();
						break;
					}
				}
				break;
			case 2:
				if(ac.getState()==false) {
					System.out.println("\n 1] - Turn AC On\n 0] - Main Menu");
					submenu = userInp.nextInt();
					switch(submenu) {
					case 1:
						ac.on();
						break;
					}
				}
				else {
					System.out.println("\n 1] - Turn AC Off\n 0] - Main Menu");
					submenu = userInp.nextInt();
					switch(submenu) {
					case 1:
						ac.off();
						break;
					}
				}
				break;
			case 3:
				
				if(washmachine.getState()==false) {
					System.out.println("\n 1] - Turn Washing Machine On\n 0] - Main Menu");
					submenu = userInp.nextInt();
					switch(submenu) {
					case 1:
						washmachine.on();
						break;
					}
				}
				else {
					System.out.println("\n 1] - Turn Washing Machine Off\n 0] - Main Menu");
					submenu = userInp.nextInt();
					switch(submenu) {
					case 1:
						washmachine.off();
						break;
					}
				}
				break;
			case 4:
				
				if(tv.getState()==false) {
					System.out.println("\n 1] - Turn TV On\n 0] - Main Menu");
					submenu = userInp.nextInt();
					switch(submenu) {
					case 1:
						tv.on();
						break;
					}
				}
				else {
					System.out.println("\n 1] - Turn TV Off\n 2] - Volume Up\n 3] - Volume Down\n 4] - Channel Up\n 5] - Channel Down\n 0] - Main Menu");
					submenu = userInp.nextInt();
					switch(submenu) {
					case 1:
						tv.off();
						break;
					case 2:
						tv.volup();
						break;
					case 3:
						tv.voldw();
						break;
					case 4:
						tv.chup();
						break;
					case 5:
						tv.chdw();
						break;
					}
				}
				break;
			case 5:
				
				if(as.getState()==false) {
					System.out.println("\n 1] - Turn Audio System On\n 0] - Main Menu");
					submenu = userInp.nextInt();
					switch(submenu) {
					case 1:
						as.on();
						break;
					}
				}
				else {
					System.out.println("\n 1] - Turn Audio System Off\n 0] - Main Menu");
					submenu = userInp.nextInt();
					switch(submenu) {
					case 1:
						as.off();
						break;
					}
				}
				break;
			case 0:
				HASon=false;
				break;
			default:
				HASon=false;
				break;
			}
			System.out.println("Enter your Choice"); 
		}
		
		userInp.close();
		
		/*
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
		*/
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
 