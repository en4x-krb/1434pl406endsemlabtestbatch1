import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LightTest {
	Light light;
	@Before
	public void setUp() throws Exception {
		light = new Light();
	}

	@Test
	public void test() {
		light.on();
		assertEquals(true,light.getLightState());
		
		light.off();
		assertEquals(false,light.getLightState());
	}

}
