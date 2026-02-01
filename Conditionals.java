
import java.util.*;

public class Conditionals {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Conditionals
        int count = 5;
        if(count == 5){
            System.out.println(count);
        }
        else{
            System.out.println("Nope");
        }


        //Practice question
        System.out.print("Enter your salary:- ");
        float salary = input.nextFloat();
        if(salary>1000){
            salary = (float) (salary + 1000);
        }
        else{
            salary = (float)(salary+2000);
        }
        System.out.println("toatal Salary:- "+salary);


        // if else ladder
        System.out.print("Enter your marks:-");
        int marks = input.nextInt();
        if(marks>90){
            System.out.println("Grade : A");
        }
        else if(marks>70){
            System.out.println("Grade : B");
        }
        else if(marks>50){
            System.out.println("Grade : C");
        }
        else{
            System.out.println("Failed");
        }


        // Q: Find the maximum between three numbers 
        System.out.print("Enter the 1st number:- ");
        float a = input.nextFloat();
        System.out.print("Enter the 2nd number:- ");
        float b = input.nextFloat();
        System.out.print("Enter the 3rd number:- ");
        float c = input.nextFloat();
        float max = a;
        if (b > max) {
            max = b;
        }
        else if (c >max) {
            max = c;
        }
        Optimized Version
        float max = Math.max(c,Math.max(a,b));
        System.out.println("Maximum betweeen three Numbers:- "+max);

        
        //checks if the character is in upper case oor lowercase
        System.out.print("Enter the value:- ");
        char ch = input.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("LowerCase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("UpperCase");
        }

    }
}
