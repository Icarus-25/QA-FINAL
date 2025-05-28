import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class FinalTest {

    @ParameterizedTest
    @ValueSource (ints = {Integer.MIN_VALUE,-1,0,1,15})
    void testCannotDrive(int age) {
        assertFalse(Final.canDrive(age));
    }

    @ParameterizedTest
    @ValueSource (ints = {16,17,Integer.MAX_VALUE})
    void testCanDrive(int age) {
        assertTrue(Final.canDrive(age));
    }

}