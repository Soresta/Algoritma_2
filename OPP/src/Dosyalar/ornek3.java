package Dosyalar;

import java.io.File;

public class ornek3 {
    // • doysa silme!
    public static void main(String[] args) throws Exception {
        String path = "dosya yolu";
        File doysa = new File(path);
        if (doysa.exists()) doysa.delete();
    }
}
