
//write a program to print vansh in number in java

public class VanshInNumbers {
    public static void main(String[] args) {
        String[] V = {
            "1       1",
            " 1     1 ",
            "  1   1  ",
            "   1 1   ",
            "    1    "
        };

        String[] A = {
            "   111   ",
            "  1   1  ",
            " 1111111 ",
            " 1     1 ",
            " 1     1 "
        };

        String[] N = {
            "1     1",
            "11    1",
            "1 1   1",
            "1  1  1",
            "1   11 ",
        };

        String[] S = {
            "  11111 ",
            " 1      ",
            "  1111  ",
            "      1 ",
            " 11111  "
        };

        String[] H = {
            "1     1",
            "1     1",
            "1111111",
            "1     1",
            "1     1"
        };

        // Print all letters together row by row
        for (int i = 0; i < V.length; i++) {
            System.out.println(V[i] + "   " + A[i] + "   " + N[i] + "   " + S[i] + "   " + H[i]);
        }
    }
}
