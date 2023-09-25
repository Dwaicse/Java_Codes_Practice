package functionalInterfacewithlambda;


@FunctionalInterface
interface MyLambda{
    void display();
}


public class LambdaClass {

    public static void main(String [] args){
        MyLambda myLambda = ()->{
            System.out.println("Hello World!");
        };
        myLambda.display();
    }
}
