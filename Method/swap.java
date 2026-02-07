import java.util.*;

public class swap {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st number:- ");
        int a = input.nextInt();
        System.out.print("enter the 2nd number- ");
        int b = input.nextInt();
        System.out.println("Before swapping:- ");
        System.out.println("a = "+a+" b = "+b);
        System.out.println("After Swapping:- ");
        Swap(a,b);


    }
    public static void Swap(int a ,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a+" b = "+b);
    }
}
