package composition_inheritance_abstraction_polymorphism_encapsulation;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

interface DosyaIslemci {
    public void dosyaOku(String dosyaAdi);

    public void dosyayaYaz(String dosyaAdi, String dosyaIcerigi);
}

abstract class SatirIslemci {
    public abstract String satirIsle(String satir);
}

class NotHesaplayici extends SatirIslemci implements DosyaIslemci {
    public String satirIsle(String cumle) {
        Scanner s = new Scanner(cumle);
        String no = s.next();
        double vize1 = s.nextDouble();
        double vize2 = s.nextDouble();
        double ort = (vize1 + vize2) / 2;
        String yeniCumle = no + "\t" + vize1 + "\t" + vize2 + "\t" + ort + "\n";
        return yeniCumle;
    }

    public void dosyaOku(String dosyaAdi) {
        try {
            Scanner s = new Scanner(new File(dosyaAdi));
            String yeniDosyaIcerigi = "";
            while (s.hasNext()) {
                String satir = s.nextLine();
                yeniDosyaIcerigi += satirIsle(satir);
            }
            System.out.println(yeniDosyaIcerigi);
            dosyayaYaz("notlar2.txt", yeniDosyaIcerigi);
        } catch (Exception e) {
        }
    }

    public void dosyayaYaz(String dosyaAdi, String dosyaIcerigi) {
        try {
            FileWriter fw = new FileWriter(dosyaAdi);
            fw.write(dosyaIcerigi);
            fw.close();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        NotHesaplayici n = new NotHesaplayici();
        n.dosyaOku("notlar1.txt");
    }
}
