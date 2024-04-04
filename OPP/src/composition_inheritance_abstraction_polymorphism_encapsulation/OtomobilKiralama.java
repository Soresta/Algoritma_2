package composition_inheritance_abstraction_polymorphism_encapsulation;

/*
  • Problem: Bir otomobil kiralama şirketi için bir araç sınıfı oluşturmanız gerekiyor.
  • Bu sınıfın özellikleri ve miras aldığı alt sınıflar aşağıdaki gibidir:
    • Araç Sınıfı:
     - Özellikler: marka (String), model (String), üretim yılı (int), günlük kiralama ücreti (double)
     - Metotlar: tüm özelliklere erişim metotları (getter ve setter)

    • Otomobil Sınıfı (Araç sınıfından türetilen):
     - Ek Özellikler: vites tipi (String), yakıt türü (String), koltuk sayısı (int)
     - Metotlar: tüm özelliklere erişim metotları (getter ve setter)

    • Kamyonet Sınıfı (Araç sınıfından türetilen):
     - Ek Özellikler: kasa uzunluğu (double), kasa genişliği (double), kasa yüksekliği (double)
     - Metotlar: tüm özelliklere erişim metotları (getter ve setter)
*/
class Otomobil extends Arac {
    private String vitesTipi;
    private String yakitTuru;
    private int koltukSayisi;

    public Otomobil(String marka, String model, int uretimYili, double gunlukKiralamaUcreti, String vitesTipi, String yakitTuru, int koltukSayisi) {
        super(marka, model, uretimYili, gunlukKiralamaUcreti);
        this.koltukSayisi = koltukSayisi;
        this.yakitTuru = yakitTuru;
        this.vitesTipi = vitesTipi;
    }

    public String getVitesTipi() {
        return vitesTipi;
    }

    public void setVitesTipi(String vitesTipi) {
        this.vitesTipi = vitesTipi;
    }

    public String getYakitTuru() {
        return yakitTuru;
    }

    public void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    public int getKoltukSayisi() {
        return koltukSayisi;
    }

    public void setKoltukSayisi(int koltukSayisi) {
        this.koltukSayisi = koltukSayisi;
    }
}

class Kamyonet extends Arac {
    private double kasaUzunlugu;
    private double kasaYuksekligi;
    private double kasaGenisligi;

    public Kamyonet(String marka, String model, int uretimYili, double gunlukKiralamaUcreti, double kasaUzunlugu, double kasaYuksekligi, double kasaGenisligi) {
        super(marka, model, uretimYili, gunlukKiralamaUcreti);
        this.kasaGenisligi = kasaGenisligi;
        this.kasaUzunlugu = kasaUzunlugu;
        this.kasaYuksekligi = kasaYuksekligi;
    }

    public double getKasaUzunlugu() {
        return kasaUzunlugu;
    }

    public void setKasaUzunlugu(double kasaUzunlugu) {
        this.kasaUzunlugu = kasaUzunlugu;
    }

    public double getKasaYuksekligi() {
        return kasaYuksekligi;
    }

    public void setKasaYuksekligi(double kasaYuksekligi) {
        this.kasaYuksekligi = kasaYuksekligi;
    }

    public double getKasaGenisligi() {
        return kasaGenisligi;
    }

    public void setKasaGenisligi(double kasaGenisligi) {
        this.kasaGenisligi = kasaGenisligi;
    }
}

class Arac {
    private String marka;
    private String model;
    private int uretimYili;
    private double gunlukKiralamaUcreti;

    public Arac(String marka, String model, int uretimYili, double gunlukKiralamaUcreti) {
        this.marka = marka;
        this.model = model;
        this.uretimYili = uretimYili;
        this.gunlukKiralamaUcreti = gunlukKiralamaUcreti;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public double getGunlukKiralamaUcreti() {
        return gunlukKiralamaUcreti;
    }

    public void setGunlukKiralamaUcreti(double gunlukKiralamaUcreti) {
        this.gunlukKiralamaUcreti = gunlukKiralamaUcreti;
    }
}

public class OtomobilKiralama {
    public static void main(String[] args) {
        Otomobil otomobil = new Otomobil("bmw", "A7", 2023, 1000, "Otomatik", "Benzin", 4);
        otomobil.getKoltukSayisi();
        otomobil.getVitesTipi();
        otomobil.getYakitTuru();
        otomobil.getGunlukKiralamaUcreti();
    }
}
