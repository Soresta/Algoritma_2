package Dosyalar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ornek7 {
    public static void main(String[] args) throws FileNotFoundException {
        // • yazilcak.txt dosyasına aşşağıdakileri yazınız!
        // • Ali Bal  90
        // • Ayşe dönemz  60
        String path = "yazilcal.txt";
        File dosya = new File(path);
        if (dosya.exists()) {
            System.out.println("Dosya zaten var");
            System.exit(0);
        } else {
            PrintWriter dosyayaz = new PrintWriter(dosya);
            dosyayaz.print("Ali BAL");
            dosyayaz.println(90);
            dosyayaz.print("Ayşe DÖNMEZ");
            dosyayaz.println(60);
            dosyayaz.close();
        }
    }
}
