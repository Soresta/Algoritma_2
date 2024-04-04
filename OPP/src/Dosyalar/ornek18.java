package Dosyalar;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ornek18 {
    public static void main(String[] args) throws Exception {
        // • oku.txt dosyasında sayılar ve stringler bulunmakta. bu sayıları sayıalr.dat dosyasına yazan, stringleride
        //   stringler.dat dosyasına yazan programı yazınız!
        File okuDosya = new File("oku.txt");
        File sayilarDosya = new File("sayilar.dat");
        File stringlerDosya = new File("stringler.dat");

        Scanner okuReader = new Scanner(okuDosya);
        PrintWriter sayiYaz = new PrintWriter(sayilarDosya);
        PrintWriter stringYaz = new PrintWriter(stringlerDosya);

        while (okuReader.hasNext()) {
            String str = okuReader.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if ((str.charAt(i) - 48) >= 0 && (str.charAt(i) - 48) <= 9)
                    sayiYaz.print(str.charAt(i));
                else stringYaz.print(str.charAt(i));
            }
        }
        okuReader.close();
        sayiYaz.close();
        stringYaz.close();
    }
}
