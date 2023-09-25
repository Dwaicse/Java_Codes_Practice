package FileInputOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileInputOutput {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:/Java Programmes/MyJavaFiles/Test.txt");
        String str = "My Name is Dwaipayan Bhattacharya";
        fos.write(str.getBytes());
        fos.close();
    }
}
