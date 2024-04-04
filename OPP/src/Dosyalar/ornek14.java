package Dosyalar;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ornek14 {
    // • klavyeden girilen ifadeler içinde sayı olanları sayilar.dat, karakter olarnları katakrerler.dat dosyalarına
    //   yazan prograım yazınız, not: toplam 5 ifade girilecektir!

    public static void main(String[] args) throws Exception {
        Scanner giris = new Scanner(System.in);
        File sayilar = new File("sayilar.dat");
        File karakterler = new File("karakterler.dat");
        PrintWriter sayilarYazici = new PrintWriter(sayilar);
        PrintWriter karakterlerYazici = new PrintWriter(karakterler);

        for (int i = 0; i < 5; i++) {
            String ifade = giris.nextLine();
            for (int j = 0; j < ifade.length(); j++) {
                if ((ifade.charAt(j) - 48) >= 0 && (ifade.charAt(j) - 48) <= 9) sayilarYazici.println(ifade.charAt(j));
                else karakterlerYazici.println(ifade.charAt(j));
            }
        }
        karakterlerYazici.close();
        sayilarYazici.close();
    }
}
