package composition_inheritance_abstraction_polymorphism_encapsulation;

class Motor {
    // • Composition örneği
    private static int motor_gucu = 3600;//sadece class içinden erişilebilir!(private)

    public void dur() {
        System.out.println("Motor Durdu");
    }

    public void calis() {
        System.out.println("Motor calıştı");
    }
}

class AileArabasi {
    public Motor motor = new Motor();//Composition kullanımıl

    //Motor Aile arabsının bir parçasıdır
    public void hareketET() {
        motor.calis();
        System.out.println("Aile arabası çalıştır");
    }

    public void dur() {
        motor.dur();
        System.out.println("Aile arabası durdu!");
    }
}

public class AileArabasi_calis {
    public static void main(String[] args) {
        AileArabasi aa = new AileArabasi();
        aa.hareketET();
        aa.dur();
    }
}