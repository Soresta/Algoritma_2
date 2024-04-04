package Dosyalar;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ornek11 {
    public static void main(String[] args) throws Exception {
        // • klavyeden girilen 3 kişiye ait ad, soyad numara bilgilerini veli.txt'e 3 kere yazan programı yazınız!
        //fileWriter örneği:
        Scanner read = new Scanner(System.in);
        File dosya = new File("veli.txt");
        FileWriter yazici = new FileWriter(dosya);
        for (int i = 0; i < 3; i++) {
            String ad = read.nextLine();
            String soyad = read.nextLine();
            int numara = read.nextInt();
            yazici.write("Ad: " + ad + ", Soyad: " + soyad + ", Numara: " + numara);
            read.nextLine();
        }
        yazici.close();
    }
}
