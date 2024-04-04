package Dosyalar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ornek21 {
    /* • Klavyeden 10 tane ifade yazılcak bu ifadelerde rakam olanları rakam.dat dosyasına diğer karakterleri
         diger.dat dosyasına yazan metodu yazınız!. */

    public static void dosyaYaz() throws FileNotFoundException {
        File f2 = new File("rakam.dat");
        File f3 = new File("diger.dat");
        Scanner s1 = new Scanner(System.in);
        PrintWriter p1 = new PrintWriter(f2);
        PrintWriter p2 = new PrintWriter(f3);
        for (int j = 0; j < 10; j++) {
            System.out.print("Ifadeyi yazınız: ");
            String ifade = s1.nextLine();
            for (int i = 0; i < ifade.length(); i++) {
                if (ifade.charAt(i) - 48 >= 0 && ifade.charAt(i) - 48 <= 9) {
                    p1.print(ifade.charAt(i));
                } else p2.print(ifade.charAt(i));
            }
            p1.println();
            p2.println();
        }
        p1.close();
        p2.close();
    }
    public static void main(String[] args) throws FileNotFoundException {
        dosyaYaz();
    }
}
