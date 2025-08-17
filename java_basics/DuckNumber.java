
// Duck Number

public class DuckNumber {
    public static void main(String[] args) {
        int count = 20; // Print first 20 duck numbers
        System.out.println("First " + count + " duck numbers:");

        int number = 1;
        int found = 0;

        while (found < count) {
            if (isDuckNumber(number)) {
                System.out.print(number + " ");
                found++;
            }
            number++;
        }
    }

    public static boolean isDuckNumber(int number) {
        String numStr = Integer.toString(number);
        return numStr.contains("0") && !numStr.startsWith("0");
    }
}
