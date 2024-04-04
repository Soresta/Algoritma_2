package composition_inheritance_abstraction_polymorphism_encapsulation;

class Araba2 {
    //Data field - attributes - değişkenler!
    //Araba2 sınıfının değişkenleri
    public int t = 10;
    public int tekerlek_sayisi;//int veriye bir değer atanmaz ise değeri varsayılan olarak 0 atanır!
    String renk = "Kırmızı";//String veriye bir değer atanmaz ise değeri varsayılan olarak null atanır!
    double pi = 3.14;//dounle veriye bir değer atanmaz ise değeri varsayılan olarak 0 atanır!

    //Araba2 sınıfın metodu
    public void calis() {//actions,behavior bunlar kodda metot olarak kullanılır!
        System.out.println("Araba Çalıştı!");
    }
}

public class ArabaOrnek2 {//farklı bir class (Main Class)
    public static void main(String[] args) {
        Araba2 sahin = new Araba2();//sahin somuttur!
        //new ifadesi somutlaştırır!
        sahin.calis();
        System.out.println(sahin.tekerlek_sayisi);
        System.out.println(sahin.renk);
        System.out.println(sahin.pi);
    }
}
