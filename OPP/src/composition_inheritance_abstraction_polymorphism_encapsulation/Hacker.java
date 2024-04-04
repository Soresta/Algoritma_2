package composition_inheritance_abstraction_polymorphism_encapsulation;

/*
    • Super ifadesi ata sınıfa işaret(aitlik belirtme) eder ve oluştrucularda ilk (satırda) olmalıdır!
    (eğer ki o mevcut sınıf bir ata sınıftan miras almış ve o ata sınıfta oluşturucuda zorunlu bir parametre varsa).
    • this ifadesi ise bulunduğumuz sınıfa işaret eder.(aitlik gösterir).
    • not : kalıtım yukardan aşşağı doğru çalışır

 */
class Insan {
    public Insan(int par) {
        System.out.println("Insan Yapilandiricisi " + par);
    }
}

class ZekiInsan extends Insan {
    //ZekiInsan Sınıfı, Insan Sınıfından miras aldı bundan dolayı Insan sınıfının oluşturuca
    //bulunan parametreleri super ifadesi ile göstermelidir
    public ZekiInsan(int par) {
        super(par + 1); //Insan Paremetresi
        System.out.println("ZekiInsan Yapilandiricisi " + par);
    }
}

class Hacker extends ZekiInsan {
    public Hacker(int par) {
        super(par + 1);//Zeki Insan Paremetresi
        System.out.println("Hacker Yapilandiricisi " + par);
    }

    public static void main(String args[]) {
        Hacker hck = new Hacker(5);
    }
}