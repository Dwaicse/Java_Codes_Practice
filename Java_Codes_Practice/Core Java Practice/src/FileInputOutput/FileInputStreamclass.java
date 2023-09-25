package FileInputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamclass {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:/Java Programmes/MyJavaFiles/Test.txt");
        byte b[] = new byte[fis.available()];

        fis.read(b);
        String str = new String(b);
        System.out.println(str);


    }

}
