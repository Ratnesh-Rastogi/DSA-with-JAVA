

// Program to check if the given number is prime or not.


import java.util.*;

public class CheckPrime{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int k = input.nextInt();
        System.out.println(isPrime(k));
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
            return false;
            }
            c++;
        }
        return c * c > n;
    }
}