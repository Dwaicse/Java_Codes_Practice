package functionalInterfacewithlambda;

@FunctionalInterface
interface lambdaclasswithmultiplepara{
   public int add(int a,int b);
}

@FunctionalInterface
interface display_data{
    void display(String s);
}


public class LambdaClasswithMultipleParameter {

    public static void main(String[] args){
        lambdaclasswithmultiplepara lambdaclasswithmultiplepara = (a,b)-> (a+b);
        int result = lambdaclasswithmultiplepara.add(5,6);

        display_data display_data = (s)->{System.out.println(s);};
        display_data.display("The sum is: "+ result);

    }
}
