

import java.util.Scanner;

public class greeting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name:- ");
        String naam = input.nextLine();
        System.out.println(greet(naam)); //Here greetin() function is called.
    }

    public static String greet(String name) {
        // System.out.println("Hello, I am Ratnesh Rastogi");// this is used if return type is void.
        String greet = "Hello " + name;
        return greet; // return is used when the return type is given except void.
        // If return type is string then the functioon can only return the value in string.
    }
}
