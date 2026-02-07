import java.util.*;

public class VarArgs{
    public static void main(String args[]){
        fun(1,2,5,7,6,22,15,79);
        multipleArgs(1,4,"rat","cat");
    }

    public static void multipleArgs(int a, int b ,String ...c){ //here you can also take diffrent type of arguents with variable arguments.
    
        System.out.println(a +" "+ b +" "+ Arrays.toString(c)); // but variable arguents must be in last because you dont know when it stops.
    }
    public static void fun(int ...a){
       System.out.println(Arrays.toString(a));
    }
}

/*Syntax:-  
public static <return-type> <method-name>(<return-type> ...<alphabet>) // alphabet can be any but the three dots are compulsory otherwise error.
{
<body>
}

public static void main(String args[])
{
<method-call>(<number-of-arguments-of-same-return-type>);
}

// it stores all the aarguments in an array. */

