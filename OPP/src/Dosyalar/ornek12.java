package Dosyalar;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ornek12 {
    public static void main(String[] args) throws Exception {
        // • klavyeden girilen 3 kişiye ait ad, soyad numara bilgilerini veli.txt'e 3 kere yazan programı yazınız!
        //printWriter örneği:
        Scanner read = new Scanner(System.in);
        File dosya = new File("veli.txt");
        PrintWriter yazici = new PrintWriter(dosya);
        for (int i = 0; i < 3; i++) {
            System.out.print("Lütfen " + (i + 1) + ". kişini Adını giriniz: ");
            String ad = read.nextLine();
            System.out.print("Lütfen " + (i + 1) + ". kişini Soyadını giriniz: ");
            String soyad = read.nextLine();
            System.out.print("Lütfen " + (i + 1) + ". kişini Numarasını giriniz: ");
            int numara = read.nextInt();
            yazici.println("Ad: " + ad + ", Soyad: " + soyad + ", Numara: " + numara);
            read.nextLine();
        }
        yazici.close();
    }
}