import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ACTest {
	AC ac;
	@Before
	public void setUp() throws Exception {
		ac = new AC();
	}

	@Test
	public void test() {
		ac.on();
		assertEquals(true,ac.getState());
		
		ac.off();
		assertEquals(false,ac.getState());
	}

}
