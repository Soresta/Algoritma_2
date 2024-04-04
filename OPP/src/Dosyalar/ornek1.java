package Dosyalar;

import java.io.File;

public class ornek1 {
    // • doysa oluşturma
    public static void main(String[] args) throws Exception {
        File dosya = new File("oluşturulcak dosyanın yolu");
        if (!dosya.exists()) {
            dosya.createNewFile();
        } else {
            System.out.println("Dosya bulunmakta");
        }
    }
}
