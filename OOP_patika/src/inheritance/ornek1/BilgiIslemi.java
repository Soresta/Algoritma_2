package inheritance.ornek1;

public class BilgiIslemi extends Memur {
    private String gorev;

    public BilgiIslemi(String adSoyad, String telefon, String eposta, String depratman, String mesai, String gorev) {
        super(adSoyad, telefon, eposta, depratman, mesai);
        this.gorev = gorev;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public void networkKurulum() {
        System.out.println(this.getAdSoyad() + " network kurulumu yaptı");
    }
}
