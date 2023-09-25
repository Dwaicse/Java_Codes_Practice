package FileInputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreambytebybyte {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:/Java Programmes/MyJavaFiles/Test.txt");
        int x;
        do{
            x= fis.read();
            if(x!=-1){
                System.out.print((char)x);
            }
        }while(x!=-1);


    }
}
