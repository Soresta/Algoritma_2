package Dosyalar;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ornek16 {
    public static void main(String[] args)throws Exception {
        // • klavyeden rastgele string girişleri yapılıyor, girilen stringler içinde ilk harfi a ile başlayanları swift.dat
        //   dosyasına yazan ve bu stringlerin sayısı 5 olunca duran programı yazınız!
        Scanner giris = new Scanner(System.in);
        File strDosya = new File("swift.dat");
        PrintWriter yazici = new PrintWriter(strDosya);
        int condition = 0;
        while (condition < 5) {
            System.out.print("Giriş yapınız:");
            String str = giris.nextLine();
            if (str.charAt(0) == 'a' || str.charAt(0) == 'A') {
                yazici.println(str);
                condition++;
            }
        }
        yazici.close();
        //2.kısım swift.dat dosyasına yazılan  bu stringleri tekrar okuyup ekrana yaz!
        Scanner reader = new Scanner(strDosya);
        while (reader.hasNext())System.out.println(reader.nextLine());
        reader.close();
    }
}
