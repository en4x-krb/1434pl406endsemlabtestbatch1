import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WashMachineTest {

	WashMachine washMachine;
	@Before
	public void setUp() throws Exception {
		washMachine = new WashMachine();
	}

	@Test
	public void test() {
		washMachine.on();
		assertEquals(true,washMachine.getState());
		
		washMachine.off();
		assertEquals(false,washMachine.getState());
	}

}
