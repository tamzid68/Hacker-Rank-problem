import java.io.*;

class Result {


    public static void typeCounter(String sentence) {
        String[] substrings = sentence.split("\\s+");

        int stringCount = 0;
        int integerCount = 0;
        int doubleCount = 0;

        for (String substring : substrings) {
            if (isInteger(substring)) {
                integerCount++;
            } else if (isDouble(substring)) {
                doubleCount++;
            } else {
                stringCount++;
            }
        }

        System.out.println("string " + stringCount);
        System.out.println("integer " + integerCount);
        System.out.println("double " + doubleCount);
    }

    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isDouble(String s) {
        if (s == null || s.isEmpty()) return false;
        try {
            Double d = Double.parseDouble(s);
            // Ensure that a valid double is parsed and check edge cases
            return !s.equals(Integer.toString(d.intValue())) && s.contains(".");
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

