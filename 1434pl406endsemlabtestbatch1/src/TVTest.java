import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TVTest {

	TV tv;;
	@Before
	public void setUp() throws Exception {
		tv = new TV();
	}

	@Test
	public void test() {
		tv.on();
		assertEquals(true,tv.getTVState());
		
		tv.off();
		assertEquals(false,tv.getTVState());
		
		tv.on();
		tv.chdw();
		assertEquals(300,tv.getChannel());
		tv.chup();
		assertEquals(1,tv.getChannel());
		
		tv.voldw();
		assertEquals(9,tv.getVol());
		tv.volup();
		assertEquals(10,tv.getVol());
		
		
	}

}
