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
		assertEquals(true,light.getState());
		
		light.off();
		assertEquals(false,light.getState());
	}

}
