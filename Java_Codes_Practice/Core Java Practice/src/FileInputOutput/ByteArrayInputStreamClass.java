package FileInputOutput;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamClass {

    public static void main(String [] args) throws IOException {
        byte b[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        String str = new String(bis.readAllBytes());
        System.out.println(str);
        bis.close();
    }

}
