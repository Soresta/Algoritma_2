package composition_inheritance_abstraction_polymorphism_encapsulation;
// Compostion Örneği :
class Govde {
    void benzinTankKontrol() {
    }
}

class SagBacak {
    void benzinTankKontrol() {
    }
}

class SolBacak {
    void maviLazerSilahiAtesle() {
    }
}

class SagKol {
    void hedeHodoKalkaniCalistir() {
    }
}

class SolKol {
    void gucKaynagiKontrolEt() {
    }
}

class Kafa {
    void tumBirimlereUyariGonder() {
    }

    void dusmanTanimlamaSistemiDevreyeSok() {
    }
}

public class Voltron {
    Govde gv = new Govde();
    SolBacak slb = new SolBacak();
    SagBacak sgb = new SagBacak();
    SagKol sgk = new SagKol();
    SolKol slk = new SolKol();
    Kafa kf = new Kafa();

    public static void main(String[] args) {
        Voltron vt = new Voltron();
        vt.kf.dusmanTanimlamaSistemiDevreyeSok();
        vt.kf.tumBirimlereUyariGonder();
        vt.sgb.benzinTankKontrol();
    }

}
