import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AudioSystemTest {
	AudioSystem as;
	@Before
	public void setUp() throws Exception {
		as = new AudioSystem();
	}

	@Test
	public void test() {
		as.on();
		assertEquals(true,as.getState());
		
		as.off();
		assertEquals(false,as.getState());
	}

}
