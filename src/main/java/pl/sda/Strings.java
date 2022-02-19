package pl.sda;

public class Strings {
    public static String toUpperCase(String input) {
        return input.trim().toUpperCase();
    }

    // null -> blank
    // "" -> blank
    // " " -> blank
    public static boolean isBlank(String input) {
        return input == null || input.trim().isEmpty();
    }
}