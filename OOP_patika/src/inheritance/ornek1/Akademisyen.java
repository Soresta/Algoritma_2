package inheritance.ornek1;

public abstract class Akademisyen extends Calisan {
    private String bolum;
    private String unvan;

    public Akademisyen(String adSoyad, String telefon, String eposta, String bolum, String unvan) {
        super(adSoyad, telefon, eposta);
        //super metodu en yukarda olmak zorunda miras alır sonra kendi özellikleri eklenir
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public abstract void derseGir(String dersSaati);
    @Override
    public void giris(){
        System.out.println("Akdemisyen giriş yaptı!");
    }
}
