package composition_inheritance_abstraction_polymorphism_encapsulation;

interface Aylar {
    //  • interface kullanımı(arayüz):
    final String ay1 = "Ocak";
    final String ay6 = "haziran";
    final String ay9 = "eylul";

    void kureme(String ay);

    void okulKarnesi(String ay);

    void okulBaslar(String ay);//soyut metot
}

class Sene implements Aylar {
    public void kureme(String ay) {
        if (ay.equals(ay1))
            System.out.println("1. ayda akr kurenir");
        else System.out.println("girilen ayda kar kurenmez");
    }

    @Override
    public void okulKarnesi(String ay) {
        if (ay.equals(ay6))
            System.out.println("6.ayda karne alınır");
        else System.out.println("girilen ayda karna alınamaz");
    }

    @Override
    public void okulBaslar(String ay) {
        if (ay.equals(ay9))
            System.out.println("9.ayda okul başalr");
        else System.out.println("girilen ayda okullar tatil,başlatılamaz");
    }
}

public class SeneSorusu {
    //Yıllın ayları kullanılcaktır! 1.ayda kar küreme yapılcaktır , 6. ayda okul karnesi alıncaktır 9. ayda ise okullar başlayacaktır
    //bu işlemleri gerçekleştiren OOP yapısını yapınız!
    public static void main(String[] args) {
        Sene a1 = new Sene();
        a1.okulBaslar("şubat");
    }
}


