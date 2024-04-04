package composition_inheritance_abstraction_polymorphism_encapsulation;

class Kedi {//sınıf 1
    //inheritance (Miras) örneği
    protected int ayakSayisi = 4;
    public void yakalaAv() {
        System.out.println("Av yakalndı");
    }
    public static void main(String[] args) {
        Kedi kd = new Kedi();
        kd.yakalaAv();
    }
}


class Kaplan extends Kedi {//2.sınıf (kedi sınıfından miras alıyor)
    //kaplan kedinin özelliklerini kullanabilir(public olanları!)
    public static void main(String[] args) {
        Kaplan kp = new Kaplan();
        kp.yakalaAv();
        System.out.println("Ayak sayisi =" + kp.ayakSayisi);
    }

}
