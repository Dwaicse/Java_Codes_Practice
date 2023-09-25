package functionalInterfacewithlambda;

@FunctionalInterface
interface CapturedtheLambda{
    public void display();
}

class useCapturedLambda{
    public void callLambda(CapturedtheLambda cl)
    {
        cl.display();
    }
}

class Demo{

    public void method1(){
        useCapturedLambda useCapturedLambda = new useCapturedLambda();
        useCapturedLambda.callLambda(()->{System.out.println("Hello World!");});
    }

}



public class CapturedLambda {

    public static void main(String[] args){
        Demo d = new Demo();
        d.method1();

    }

}
