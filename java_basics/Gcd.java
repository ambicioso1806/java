
// GCD OF TWO NUMBER


    import java.util.Scanner;

    public class gcdcalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            int gcd = findGCD(num1, num2);

            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

            scanner.close();
        }

        // Method to find GCD using Euclidean algorithm
        public static int findGCD(int a, int b) {
            // Ensure positive numbers
            a = Math.abs(a);
            b = Math.abs(b);

            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }

