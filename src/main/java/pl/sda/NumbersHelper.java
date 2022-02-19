package pl.sda;

//TODO use @ValueSource
//TODO pass data from CSV file
public class NumbersHelper {
    /**
     * @param number - number to validate
     * @return - return odd number
     * @throws - {@link IllegalArgumentException} - when number is 0
     */
    public static boolean isOdd(int number) {
        if (number == 0) {
            throw new IllegalArgumentException("number is 0!");
        }
        return number % 2 != 0;
    }

    public static float divide(float a, float b) {
        if (b == 0) {
            throw new IllegalArgumentException("dividend can't be 0");
        }
        return a / b;
    }
}