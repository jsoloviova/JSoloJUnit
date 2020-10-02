import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculatorTest.class,
        AssertTrueTest.class,
        AssertSameTest.class,
        AssertThat.class,
        AssertNullTest.class
})

public class FeatureTestSuite {
}
