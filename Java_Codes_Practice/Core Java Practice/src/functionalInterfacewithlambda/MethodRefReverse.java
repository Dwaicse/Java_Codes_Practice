package functionalInterfacewithlambda;


@FunctionalInterface
interface MyLambdaReverse{
    void display(String str);
}



public class MethodRefReverse {


    public static void reverse(String str)
    {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }



    public static void main(String[] args){

        MyLambdaReverse myLambdaReverse = MethodRefReverse::reverse;
        myLambdaReverse.display("Dwaipayan");

    }
}
