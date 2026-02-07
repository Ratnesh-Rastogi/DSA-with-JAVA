
import java.util.Scanner;

public class SUM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 1st Number:- ");
        int n1 = input.nextInt(); // Iinput of 1st Number is  stored in n1.
        System.out.print("Enter the 2nd Number:- ");
        int n2 = input.nextInt(); //Input of 2nd number is stored in n2.
        System.out.println("Sum = " + sum(n1, n2)); // Here sum() function is called.
    }

    public static int sum(int n1, int n2) {
        int sum = n1 + n2; //sum of n1 and n2 is stored in sum.
        // System.out.println("Sum = "+ sum);
        return sum;
        //If return type is integer then the function can only return the value in integer.
    }
}
