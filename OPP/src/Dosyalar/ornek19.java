package Dosyalar;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ornek19 {
    public static void main(String[] args) throws IOException {
        // •  oku.txt ile sayilar.dat dosyasnın içeriklerini genel.txt dosyasının içine yazınız!
        File okuDosya = new File("oku.txt");
        File sayilarDosya = new File("sayilar.dat");
        File genelDosya = new File("genel.txt");

        Scanner okuReader = new Scanner(okuDosya);
        Scanner sayiReader = new Scanner(sayilarDosya);
        PrintWriter genelYaz = new PrintWriter(genelDosya);

        while (okuReader.hasNext()) genelYaz.println(okuReader.nextLine());
        while (sayiReader.hasNext()) genelYaz.println(sayiReader.nextLine());

        okuReader.close();
        sayiReader.close();
        genelYaz.close();
    }
}
