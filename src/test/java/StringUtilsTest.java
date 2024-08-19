import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumberSchouldReturnTrue() {
        assertTrue(StringUtils.isPositiveNumber("3244"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc", "-32", "1.2a", "-3.3"})
    void isPositiveNumberSchouldReturnFalse(String str) {
        assertFalse(StringUtils.isPositiveNumber(str));
    }
}
