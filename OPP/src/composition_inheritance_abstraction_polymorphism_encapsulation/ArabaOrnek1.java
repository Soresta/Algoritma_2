package composition_inheritance_abstraction_polymorphism_encapsulation;

//soru : Araba adlı bir sınıf oluştur ve bu sınıfın 2 özelliği olsun(renk,modelYili)
//oluşturduğun bu sınıfıtan nesneler oluştur ve özelliklerini ekrana yazdır!
class Araba {//class Araba
    String renk;
    int modelYili;

    //construactor - oluşturucu : classla aynı isme sahip metot
    public Araba() {//parametresiz oluşturucu
        System.out.println("Araba construactoru içindeyiz!");
        renk = "Siyah";
        modelYili = 2020;
    }

    public Araba(String color, int year) {//parametreli construactor
        renk = color;
        modelYili = year;
    }
}

public class ArabaOrnek1 {
    public static void main(String[] args) {
        Araba bmw = new Araba();//somutlaştırmadır!
        System.out.println(bmw.renk);
        System.out.println(bmw.modelYili);

        Araba toyota = new Araba("beyaz", 2023);
        System.out.println(toyota.renk);
        System.out.println(toyota.modelYili);

    }
}