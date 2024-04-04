package inheritance.ornek1;

public class Calisan {
    private String adSoyad;
    private String telefon;
    private String eposta;

    public Calisan(String adSoyad, String telefon, String eposta) {
        this.adSoyad = adSoyad;
        this.eposta = eposta;
        this.telefon = telefon;
    }

    public String getAdSoyad() {
        return this.adSoyad;
    }

    public String getTelefon() {
        return this.telefon;
    }

    public String getEposta() {
        return this.eposta;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public void giris() {
        System.out.println(this.adSoyad + " Üniversiteye giriş yaptı");
    }
    //metot overloading(aşırı yükleme) kullanılmıştır alttaki 2 metotta!
    public void giris(String girisSaati) {
        System.out.println(this.adSoyad + " " + girisSaati + " Üniversiteye giriş yaptı");
    }

    public void giris(String girisSaati,String cikisSaati) {
        System.out.println(this.adSoyad + " " + girisSaati + " Üniversiteye giriş yaptı ve " + cikisSaati +" Çıkış yaptı");
    }

    public void cikis() {
        System.out.println(this.adSoyad + " Üniversiteden çıkış yaptı");
    }

    public void yemekHane() {
        System.out.println(this.adSoyad + " yemekhaneye giriş yaptı");
    }
}
