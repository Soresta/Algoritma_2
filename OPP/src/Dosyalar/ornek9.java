package Dosyalar;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ornek9 {
    public static void main(String[] args) throws Exception {
        // • soru: klavyeden girilen ad soyad ve not bilgilerini ogrenci.txt dosyasına yazan programı yaz.
        File dosya = new File("ogrenci.txt");
        PrintWriter cikti;
        Scanner klavye = new Scanner(System.in);

        if (!dosya.exists()) dosya.createNewFile();
        else {
            cikti = new PrintWriter(dosya);
            for (int j = 0; j < 3; j++) {
                System.out.println(j + ". Ogrenci adi soyadi ve notu");
                String ad = klavye.next();
                String soyad = klavye.next();
                int not = klavye.nextInt();
                cikti.println(ad + " " + soyad + " " + not);
            }
            cikti.close();
        }
    }
}