// odd/even without using modulo operator
package P1;

import java.util.Scanner;

public class CS3 {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int n = num/2;
        if(n*2==num){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}