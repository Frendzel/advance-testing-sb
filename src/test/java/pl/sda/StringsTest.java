package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class StringsTest {

    @ParameterizedTest
    @ValueSource(strings = {"abc", "def", "ghi", " jkl"})
    @DisplayName("Should test toUpperCase method - positive")
    void toUpperCase(String arg) {
        String result = Strings.toUpperCase(arg);
        Assertions.assertEquals(result, arg.trim().toUpperCase());
    }

    @Test
    @DisplayName("Should test toUpperCase method - positive")
    public void toUpperCaseTest(){
        //given
        String input = " abbcde";
        //when
        String result = Strings.toUpperCase(input);
        //then
        Assertions.assertEquals(result, "ABBCDE");
    }

    @ParameterizedTest
    @ValueSource(strings = {""," ", "  "}) //given
    @DisplayName("Should test isBlank method - positive")
    void isBlank(String arg) {
        //when
        boolean blank = Strings.isBlank(arg);
        //then
        Assertions.assertTrue(blank);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1asa","asas ", "  fafaf"}) //given
    @DisplayName("Should test isBlank method - negative")
    void isNotBlank(String arg) {
        //when
        boolean blank = Strings.isBlank(arg);
        //then
        Assertions.assertFalse(blank);
    }
}