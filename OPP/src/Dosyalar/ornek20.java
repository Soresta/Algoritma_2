package Dosyalar;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ornek20 {
    public static void main(String[] args) throws IOException {
        // •  ali.txt dosyası içindeki 60. ile 70. satır arasındaki bilgileri okuyup ekrana yazan programı yazınız!
        // •  not 60 veya 70 satırlık bir metin dosyasyı yazmamk veya oluşturmamak için sınırları 6 ile 15 arasına çekmişim!
        File dosya = new File("ali.txt");
        Scanner reader = new Scanner(dosya);
        int sayac = 1;
        while (reader.hasNext()) {
            if (sayac > 6 && sayac < 15) {
                System.out.println(reader.nextLine());
            } else reader.nextLine();
            sayac++;
        }
        reader.close();
    }
}
