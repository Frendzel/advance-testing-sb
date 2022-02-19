package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

class NumbersHelperTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7})
    @DisplayName("Check if number is odd - positive")
    public void isOddTest(int a) {
        //when
        boolean result = NumbersHelper.isOdd(a);
        //then
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    @DisplayName("Check if number is odd - negative")
    public void isNotOddTest(int a) {
        //when
        boolean result = NumbersHelper.isOdd(a);
        //then
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Check if number is zero - negative")
    public void testIfZero(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> NumbersHelper.isOdd(0));
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/oddFiles.csv")
    @DisplayName("Check if number is odd - positive")
    public void isNotOddTestFromFile(int a) {
        //when
        boolean result = NumbersHelper.isOdd(a);
        //then
        Assertions.assertTrue(result);
    }
}