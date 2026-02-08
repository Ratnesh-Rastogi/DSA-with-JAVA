import java.util.*;

public class factors{
    public static void main(String[] data){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num = input.nextInt();
        factor(num);
    }

    static void factor(int num){
        System.out.print(num + "! = ");
        for(int i = 1; i<=num ; i++){
            if(num % i == 0){
                System.out.print(i);
                if(i < num){
                    System.out.print(" x ");  
                } 
            }
        }
    }
}