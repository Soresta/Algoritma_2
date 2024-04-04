package inheritance.ornek1;

public abstract class Memur extends Calisan {
    private String depratman;
    private String mesai;

    public Memur(String adSoyad, String telefon, String eposta, String depratman, String mesai) {
        super(adSoyad, telefon, eposta);
        this.depratman = depratman;
        this.mesai = mesai;
    }

    public String getDepratman() {
        return depratman;
    }

    public void setDepratman(String depratman) {
        this.depratman = depratman;
    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }

    public void calis() {
        System.out.println(this.getAdSoyad() + " Çalışıyor...");
    }

    //override işlemi yapıldı! ata sınıfta olan girişi görmezden gelir ve memur sınıfındaki giris metoduna bakar
    @Override
    public void giris(){
        System.out.println(this.getAdSoyad() +" Memuru A kapısından giriş yaptı!");
    }
}
