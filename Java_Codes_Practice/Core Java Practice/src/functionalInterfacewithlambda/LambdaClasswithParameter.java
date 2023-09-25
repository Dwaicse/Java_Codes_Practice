package functionalInterfacewithlambda;

@FunctionalInterface
interface MyLambdawithPara{
    void display(String s);
}

public class LambdaClasswithParameter {

    public static void main(String[] args){
        MyLambdawithPara myLambdawithPara = (s)->{System.out.println(s);};
        myLambdawithPara.display("Hello World from Lambda with Para");
    }
}
