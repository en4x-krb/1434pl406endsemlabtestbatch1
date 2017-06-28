import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ACTest.class, AudioSystemTest.class, LightTest.class, TVTest.class, WashMachineTest.class })
public class AllTests {

}
