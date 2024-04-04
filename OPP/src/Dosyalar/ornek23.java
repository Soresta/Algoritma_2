package Dosyalar;

import java.io.File;
import java.util.Scanner;

public class ornek23 {
    // • Elinizde "Notlar.txt" isimli bir metin dosyasında bir vize sınavından
    //   öğrencilerin farklı derslerden aldığı notlar bulunmaktadır. Buna göre dosyadaki
    //   her bir ders için not ortalamasını hesaplayan Java programını yazınız?
    public static void main(String[] args) throws Exception {
        File f1 = new File("otlar.txt");
        Scanner s1 = new Scanner(f1);

        while (s1.hasNext()) {
            String str = s1.next();
            System.out.print(str + ":");
            if (!((str.charAt(0) - 48 >= 0) && (str.charAt(0) - 48 <= 9))) {
                double ortalama = 0;
                double sayac = 0;
                while (s1.hasNextInt()) {
                    ortalama += s1.nextInt();
                    sayac++;
                }
                System.out.println(ortalama / sayac);
            }
        }
    }
}