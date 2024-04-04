package composition_inheritance_abstraction_polymorphism_encapsulation;

/*
   • Problem: Bir restoranın menüsünü temsil etmek için bir Java sınıfı oluşturmanız gerekiyor.
     Bu sınıfın altında yemek ve içecek sınıfları yer alacak. Hem yemek hem de içecek sınıfları,
     ortak bir özellik olan ad ve fiyat özelliklerini içermelidir. Yemek sınıfı aynı zamanda bir
     abstract sınıf olmalıdır ve alt sınıflarında özel bir metot içermelidir.
*/
abstract class Icerik {
    private String ad;
    private int fiyat;

    Icerik(String ad, int fiyat) {
        this.ad = ad;
        this.fiyat = fiyat;
    }

    public abstract void hazirla();

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
}

class Yemek extends Icerik {
    Yemek(String ad, int fiyat) {
        super(ad, fiyat);
    }

    @Override
    public void hazirla() {
        System.out.println("Yemek hazırlanıyor!");
    }
}

class Icecek extends Icerik {
    Icecek(String ad, int fiyat) {
        super(ad, fiyat);
    }

    @Override
    public void hazirla() {
        System.out.println("Icecek hazırlanıyor!");
    }
}

public class RestorantMenusuSorusu {
    public static void main(String[] args) {
        Yemek noodle = new Yemek("Noodle", 10);
        Icecek kola = new Icecek("Kola", 20);
        noodle.hazirla();
        kola.hazirla();
    }
}
