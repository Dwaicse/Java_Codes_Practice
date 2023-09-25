package StudentChallenge.copyafile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

public class StudentChallengeCopyaFile {
    public static void main(String[] args) throws Exception {
        FileReader fis = new FileReader("Source1.txt");
        FileOutputStream fos = new FileOutputStream("Source2.txt");
        int x;
        do{
            x = fis.read();
            if(x!=-1) {
               if(x>=65 && x<=120){fos.write(x + 32);}
               else{
                   fos.write(x);
                }
            }

        }while(x!=-1);
        System.out.println("Copying Done!");
        fis.close();
        fos.close();
    }

}
