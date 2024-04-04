package inheritance.ornek1;

public class OgretimGorevlisi extends Akademisyen {
    private String kapiNo;

    public void senatoToplanti() {
        System.out.println("Toplantıya katıldı!");
    }

    public void sinavYap() {
        System.out.println("Sınav yapıldı");
    }

    public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String bolum, String unvan, String kapiNo) {
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    @Override
    public void derseGir(String saat) {
        System.out.println(this.getAdSoyad() + " öğretim görevlisi derse " + saat + " giriş yaptı ");
    }
}
