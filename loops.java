import java.util.Scanner;

public class loops {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

        // // Loops
        // //while loop

        // int count = 1;
        // while(count != 6){
        //     System.out.println(count);
        //     count++;
        // }

        // //For loop
        // int count;
        // for(count=1;count!=6;count++){
        //     System.out.println(count);
        // }

        // // nth Fibonnacci

        // System.out.print("Enter the Value:- ");
        // int n = input.nextInt();
        // int a = 0;
        // int b = 1;
        // int count = 2;

        // while(count<=n){
        //     int temp = b;
        //     b = b + a;
        //     a = temp;
        //     count++;
        // }
        // System.out.println(b);


        // //Count the Number of Occurence of a number
        // System.out.print("Enter the Value:- ");
        // int n = input.nextInt();
        // System.out.print("Enter the number to be searched:- ");
        // int k = input.nextInt();
        // int count = 0;
        // while(n>0){
        //     int rem = n%10;
        //     if(k == rem){
        //         count++;
        //     }
        //     n = n/10;
        // }
        // System.out.println(count);
        

        // //Find the reverse of given number
        // System.out.print("Enter the number:- ");
        // int num = input.nextInt();
        // int rev = 0;
        // while(num>0){
        //     int rem = num % 10;
        //     rev = rev * 10 + rem;
        //     num = num/10;
        // }
        // System.out.println(rev);



        //Caluculator using Switch Case
        System.out.print("enter the operator :- ");
        char op = input.next().trim().charAt(0);
        
        System.out.print("Enter the 1st number:- ");
        int n1 = input.nextInt();
        System.out.print("enter the 2nd number:- ");
        int n2 = input.nextInt();

        switch(op){
            case '+':
                System.out.println(n1+" + "+n2 + " = " + (n1 + n2));
                break; 

            case '-':
                System.out.println(n1+" - " +n2+ " = "+(n1 - n2));
                break;

            case '*':
                System.out.println(n1+" * "+n2+" = "+(n1 * n2));
                break;

            case '/':
                System.out.println(n1+" / "+n2+" = "+(n1 / n2));
                break;

            case '%':
                System.out.println((n1+" % "+n2+" = "+n1 % n2));
                break;

            default:
                System.out.println("Invalid Operator");
                break;
        }



    }
}
