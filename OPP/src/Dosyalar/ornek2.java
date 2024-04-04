package Dosyalar;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ornek2 {
    // • klasör oluşturma!
    public static void main(String[] args) throws Exception {
        Files.createDirectories(Paths.get("oluşacak klasörün yolu"));//klasor oluşturma!
        new File("oluşacak klasörün yolu").mkdir();//klasor oluşturma yöntem2
    }
}
