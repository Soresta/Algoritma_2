package Dosyalar;

import java.io.File;
import java.util.Scanner;

public class ornek8 {
    public static void main(String[] args) throws Exception {
        // • bilgiler.txt dosyasında bulunana bilgileri ekrana yazdıran programı yazınız!
        String path = "bilgiler.txt";
        File dosya = new File(path);
        Scanner giris = new Scanner(dosya);
        while (giris.hasNext()) {
            String isim = giris.next();
            int not = giris.nextInt();
            System.out.println(isim + "," + not + " ");
        }
        giris.close();
    }
}
