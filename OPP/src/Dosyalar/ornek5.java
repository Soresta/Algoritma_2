package Dosyalar;

import java.io.File;

public class ornek5 {
    // • doysa listeleme
    public static void main(String[] args) throws Exception {
        String path = "klasor yolu";
        File dosya = new File(path);
        if (dosya.isDirectory()) {
            File[] dosyalar = dosya.listFiles();
            for (int i = 0; i < dosyalar.length; i++) {
                System.out.println(dosyalar[i].getName());
            }
        } else {
            System.out.println("klasör değil!");
        }
    }
}
