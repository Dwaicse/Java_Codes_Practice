package FileInputOutput;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamClass {

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        bos.write('e');
        bos.write('f');

        byte b[]=bos.toByteArray();
        for(byte x:b){
            System.out.println((char)x);

        }bos.close();
    }


}
