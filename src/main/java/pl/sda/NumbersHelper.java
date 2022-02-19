package pl.sda;

//TODO write parametrized test
//TODO write simple junit test
//TODO use @ValueSource
//TODO pass data from CSV file
public class NumbersHelper {
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
    public static float divide(float a, float b) {
        if (b == 0) {
            throw new IllegalArgumentException("dividend can't be 0");
        }
        return a / b;
    }
}