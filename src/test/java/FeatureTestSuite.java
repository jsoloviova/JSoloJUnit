import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(value = {
        CalculatorTest.class,
        AssertTrueTest.class,
        AssertSameTest.class,
        AssertThatTest.class,
        AssertNullTest.class,
        ParameterizedTest.class
})

public class FeatureTestSuite {
}
