package Dosyalar;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ornek15 {
    // • klavyeden 10 tane sayı girilcektir!. girilen sayılar içinde tek olanları tek.dat dosyasına,
    //   çift olanları cift.dat dosyasına yazan programı yazınız!

    public static void main(String[] args) throws Exception {
        Scanner giris = new Scanner(System.in);
        File tek = new File("tek.dat");
        File cift = new File("cift.dat");
        PrintWriter tekYaz= new PrintWriter(tek);
        PrintWriter ciftYaz= new PrintWriter(cift);
        for (int i = 0; i < 5; i++) {
            int sayi = giris.nextInt();
            if (sayi%2==1) tekYaz.println(sayi);
            else ciftYaz.println(sayi);
        }
        tekYaz.close();
        ciftYaz.close();
    }
}
