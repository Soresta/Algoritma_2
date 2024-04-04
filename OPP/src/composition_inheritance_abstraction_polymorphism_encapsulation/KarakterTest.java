package composition_inheritance_abstraction_polymorphism_encapsulation;

class Karakter {
    /*
    • OOP Temel İşlemler:
    • Oluşturucu metot ve kullanımı.
    • Sınıf Değişkenleri ve kullanımı.
    • Sınıf metotları ve kullanımı.
    • Nesne oluşturma .
     */
    char karakter;

    Karakter(char karakter) {
        this.karakter = karakter;
    }

    public int karsilastir(char karakter) {
        if (this.karakter < karakter) return 1;
        else if (this.karakter > karakter) return -1;
        else return 0;
    }

    public boolean esitMi(char karakter) {
        if (karakter == this.karakter) return true;
        else return false;
    }

    public boolean rakamMi() {
        if (this.karakter - 48 <= 9 && this.karakter - 48 >= 0) return true;
        else return false;
    }

    public boolean harfMi() {
        if ((this.karakter <= 'z' && this.karakter >= 'a') ^ (this.karakter <= 'Z' && this.karakter >= 'A'))
            return true;
        else return false;
    }

    public boolean kucukHarfMi() {
        if (this.karakter <= 'z' && this.karakter >= 'a')
            return true;
        else return false;
    }

    public boolean buyukHarfMi() {
        if (this.karakter <= 'Z' && this.karakter >= 'A')
            return true;
        else return false;
    }

    public void toKucukHarf() {
        this.karakter = (char) (this.karakter + 32);
    }

    public void toBuyukHarf() {
        this.karakter = (char) (this.karakter - 32);
    }
}

public class KarakterTest {
    public static void main(String[] args) {
        Karakter k1 = new Karakter('A');
        Karakter k2 = new Karakter('z');
        Karakter k3 = new Karakter('Z');
        Karakter k4 = new Karakter('t');
        Karakter k5 = new Karakter('b');

        System.out.println(k1.buyukHarfMi());
        System.out.println(k2.buyukHarfMi());
        System.out.println(k3.kucukHarfMi());
        System.out.println(k4.kucukHarfMi());
        System.out.println(k5.esitMi('b'));
    }
}
