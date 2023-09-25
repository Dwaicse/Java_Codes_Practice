package functionalInterfacewithlambda;


@FunctionalInterface
interface lambdamethod_ref{
    void display(String s);
}






public class LambdaFunctionwithMethodReference {

    public static void main(String[] args){
        lambdamethod_ref lambdamethod_ref = System.out::println;

        lambdamethod_ref.display("Hello World!");
    }
}
