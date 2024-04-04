package Dosyalar;


import java.io.File;
import java.util.Scanner;

public class ornek22 {
    // • kendisine parametre olarak gelen dosya içinde kaç tane 100' den büyük sayı olduğunu bulup
    //   geri döndüren metodu çalışır halde veriniz
    public static int sayilariBul(File dosya) throws Exception {
        int sayac = 0;
        Scanner s1 = new Scanner(dosya);
        while (s1.hasNextInt()) {
            if (s1.nextInt() > 100) sayac++;
        }
        return sayac;
    }

    public static void main(String[] args) throws Exception {
        File d1 = new File("ornek1.txt");
        System.out.println(sayilariBul(d1));
    }
}
