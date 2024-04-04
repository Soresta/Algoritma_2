package Dosyalar;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ornek6 {
    public static void main(String[] args) {
        // • Klavyeden bir cumle girilcek bu cumleyi ornek.txt dosyasına yazan ve dosyayı kapatan progrmaı yazınız.
        PrintWriter ciktiAkimi = null;
        String dosya = "ornek.txt";
        try {
            ciktiAkimi = new PrintWriter(new FileOutputStream(dosya));
        } catch (FileNotFoundException hata) {
            System.out.println("ornek.txt dosyasi olustururken hata oldu");
            System.exit(0); // Programdan normal çıkış.
        }
        System.out.print("Bir ornek cumle giriniz:");
        Scanner klavye = new Scanner(System.in);
        String cumle = klavye.nextLine();
        ciktiAkimi.println("Klavyeden girdiginiz cumle: " + cumle);
        ciktiAkimi.println("Dosyayi kapatabiliriz.");
        ciktiAkimi.close();
        System.out.println("Girilen cumle ornek.txt dosyasina yazildi.");
    }
}
