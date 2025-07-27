
//write a program in java to prove that triangle is possible or not

import java.util.*;
public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sides of triangles");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b>c && a+c>b && b+c>a)
            System.out.println("triangle is possible");
        else
            System.out.println("triangle is not possible");
    }
}
