package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NumbersHelperTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7})
    @DisplayName("Check if number is odd - positive")
    public void test(int a) {
        boolean result = NumbersHelper.isOdd(a);
        Assertions.assertTrue(result);
    }

}