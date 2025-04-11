import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact =1;
        System.out.println("enter a number");
        int n = sc.nextInt();
        for (int i =n;i>0;i--) {
            fact = fact * i;
        }
            System.out.println("factorial of a number: " + fact);

    }
}
