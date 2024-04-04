package composition_inheritance_abstraction_polymorphism_encapsulation;
// Arayüz örneği (interface sınıflar)
interface Cihaz {//arayüz
    void ac();

    void kapat();

    void goster();
}

class Tv implements Cihaz {
    public void ac() {
        System.out.println("Televizyon açıldı!");
    }

    public void kapat() {
        System.out.println("Televizyon kapandı!");
    }

    public void goster() {
        System.out.println("Tv gösteriyor!");
    }
}

class Lcd implements Cihaz {
    public void ac() {
        System.out.println("LCD açıldı!");
    }

    public void kapat() {
        System.out.println("LCD kapandı!");
    }

    public void goster() {
        System.out.println("LCD gösteriyor!");
    }
}

class Projector implements Cihaz {
    public void ac() {
        System.out.println("Projector açıldı!");
    }

    public void kapat() {
        System.out.println("Projector kapandı!");
    }

    public void goster() {
        System.out.println("Projector gösteriyor!");
    }
}

public class YayinYap {
    public static void main(String[] args) {
        Projector p1 = new Projector();
        Tv t1 = new Tv();
        Lcd l1 = new Lcd();

        Cihaz[] cihazlar = {p1, t1, l1};

        for (Cihaz c : cihazlar
        ) {
            c.ac();
            c.kapat();
            c.goster();
            System.out.println("/-----------------------------------------/");
        }
    }
}