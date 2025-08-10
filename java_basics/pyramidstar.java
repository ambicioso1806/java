
// print pyramid star pattern

import java.util.*;
public class pyramidstarpattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

