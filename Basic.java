

// // Output in Java
import java.util.*;
public class Basic{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello World");
        System.out.print("Hello World");    // if dont  write ln then all the outputs willl be written in same line.

        System.out.println("Hello World");
        System.out.println("Hello World");   //if you will write ln then everything will be written in different line.
        System.out.print("Hello World\n");   // \n is used to give space before printing


// // Variable in Java

        int a = 20;
        int b = 30;
        System.out.println(a);
        System.out.println(b);
        String name = "Ratnesh";
        System.out.println(name);

        a = b;
        System.out.println(a);


// // Data Types
        byte b = 10;  // byte type //8bits  //size= 256[-128 to 127] only.
        System.out.println(b);

        int a = 20;  // integer variables. //4bytes
        // long   // bigger values of integer.  //8bytes
        System.out.println(a); // [used in whole numbers]

        double price = 1.5;  //bigger values of float variables. //8bytes 
        // float  //float variables //4bytes
        System.out.println(price); // [used in decimal values]

        char ch = 'c';  // only take single character at a time. // 2bytes
        System.out.println(ch);  //[a-z A-Z 0-9 @ # $ % ^ & *]

        boolean var = true; // only take true of false as value. // 1bit
        System.out.println(var); //[used in conditional statements]

        short n = 241;  //short datatypes  //2bytes
        System.out.println(n); 


//         //Sum of two variables.
           // this is single line comment
//         /* this is multi line comment
//            this is multi line comment
//            */
        int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println(sum);


// // Taking Input from user

        System.out.print("Enter your name: ");
        // String name = sc.next(); //it will take only single word as input until space.
        // System.out.println("Hello " + name);

        String name = sc.nextLine(); // it will take the whole line as input including spaces.
        System.out.println("Hello " + name);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();  // it will take integer input from user.
        System.out.println("Your age is: " + age);

        float price = sc.nextFloat(); // it will take float input from user.
        System.out.println("Price is: " + price);

        byte b = sc.nextByte(); // it will take byte input from user.
        System.out.println("Byte value is: " + b);

        double d = sc.nextDouble(); // it will take double input from user.
        System.out.println("Double value is: " + d);
        //example of double input: 12.3456789
        // difference between float and double?
        // answer: float takes 4 bytes of memory and double takes 8 bytes of memory

        long l = sc.nextLong(); // it will take long input from user.
        System.out.println("Long value is: " + l);
        //example of long input: 9876543210
        //whats the difference between int and long?
        // answer: int takes 4 bytes of memory and long takes 8 bytes of memory
        

        boolean bool = sc.nextBoolean(); // it will take boolean input from user.
        System.out.println("Boolean value is: " + bool);

        short s = sc.nextShort(); // it will take short input from user.
        System.out.println("Short value is: " + s);//short input means small integer values.
        //example: 100, 200, -150 etc.
        // difference between short and int?
        //answer: short takes 2 bytes of memory and int takes 4 bytes of memory



// // Sum of a & b (Input from user)

        System.out.print("Enter the 1st  integer value:- ");
        int a = sc.nextInt();
        System.out.print("Enter the 2st integer value:- ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(a+" + "+b+" = "+sum);



// // product of a & b(User Input)

        System.out.print("Enter the number:- ");
        int a = sc.nextInt();
        System.out.print("enter the number:- ");
        int b = sc.nextInt();
        int product = a * b;
        System.out.print(product);



// // Area of circle(User Input)

        System.out.print("Enter the radius of a circle:- ");
        float r = sc.nextFloat();
        float area = 3.14f*r*r;//if you write a decimal value by default it become 
        System.out.print(area);//double and for to make it float you can write like 3.14f.


// // Type Casting

        float a = 20.15f ;
        int b = (int)a;  //Type Casting //Explicit type conversion from float to int.
        System.out.println(b);

        int c = 20;
        float d = c; //Implicit type conversion //from int to float
        System.out.println(d);

        char ch = 'a';
        int num = ch; //Implicit type conversion
        System.out.println(num);  //from character to integer gives ascii value of character.



// //Type promotion in expresion
//if there is an expresion then short,byte and char are converted into integers.
// if in an expresion there is float,long or double then the whole expresion is
//  converted into float,long or double respectively

        // short n1 = 'a';
        // char n2 = 'b';
        // float n3 = 1.25f;
        // System.out.println(n);
        // float  n = (n2 - n1) + n3;
        // System.out.println(n);
        // byte b = 2;
        // byte a = b*2; //this is wrong //here type promotion is used.
        // //b*2 value becomes integer and conversion of integer to byte not allowed
        // System.out.println(a);
        // byte a = (byte)(b*2);
        // System.out.println(a);


// // Practice question

// // Q1 average of three numbers

        System.out.println("Enter the 1st number:-");
        System.out.println("Enter the 2nd number:-");
        System.out.println("Enter the 3rd number:-");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int avg = (num1 + num2 + num3)/3;
        System.out.println("Average of given numbers:- "+avg);


// //Q2 area of square

        System.out.print("enter the side:- ");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("Area of Square:- "+area);


// //Q3 calculate total cost

        System.out.print("Enter the cost of a pencil:- ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the cost  of a pen:- ");
        float pen = sc.nextFloat();
        System.out.print("Enter the cost of a eraser:- ");
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("Total Cost:- " +total);
        //With gst
        float newTotal = total + (0.18f * total);
        System.out.println("Total cost with 18% GST:- "+newTotal);


// // Conversion of temperature form Celcius to farenheit

        System.out.print("Enter the temperature in Celcuis:- ");
        float cel = input.nextFloat();
        float farn = (cel*9/5)+32;
        System.out.println("Temperature in Farenheit:- " +farn);

        
    }
}
