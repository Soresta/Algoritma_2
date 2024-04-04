package inheritance.ornek1;

public class GuvenlikGorevlisi extends Memur {
    private String belge;

    public GuvenlikGorevlisi(String adSoyad, String telefon, String eposta, String depratman, String mesai, String belge) {
        super(adSoyad, telefon, eposta, depratman, mesai);
        this.belge = belge;
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }

    public void nobet() {
        System.out.println(this.getAdSoyad() + " nobete başladı!");
    }

    @Override
    public void giris(){
        System.out.println(this.getAdSoyad() +" Güvenlik görevlisi B kapısından giriş yaptı!");
    }
}
