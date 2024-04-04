package Dosyalar;

import java.io.File;
import java.util.Scanner;

public class ornek17 {
    public static void main(String[] args) throws Exception {
        // • oku.txt dosyasına sayılar ve stringkler bulunmakta, bu dosyayı okuyup ekrana yazan programı yazınız:
        File oku = new File("oku.txt");
        Scanner reader = new Scanner(oku);
        while (reader.hasNext()) System.out.println(reader.nextLine());
        reader.close();
    }
}
