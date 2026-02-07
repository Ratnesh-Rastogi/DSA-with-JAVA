

//program to check if the given number is Armstong or not.
//also you can print all the 3 digits Armstrong numbers.

// import java.util.*;

public class Armstrong{
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter the number to check :- ");
        // int num = input.nextInt();
        // System.out.println(isArmstrong(num));
        for(int num = 100; num <= 999; num++){
            if( isArmstrong(num)){
                System.out.print(num + "  ");
            }
        }
    }

    public static boolean isArmstrong(int num){
        int n = num;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            int cube = rem * rem * rem;
            sum += cube;
            n = n / 10;
        }
        return sum == num;
    }
}