package composition_inheritance_abstraction_polymorphism_encapsulation;
/* • İmhertiance (Miras örnek):
     - Sınıfların arasındaki miras ilişkileri :
        - Sınıf 1 : Hayvan sınıfı ata sınıf.
        - Sınıf 2 : Yarasa sınıfı çoçuk sınıf (Hayvan sınıfından miras almalı

        - Sınıf 1 : Yarasa sınıfı Ata sınıf (Hayvan sınıfından miras almaıştı)
        • Sınıf 2 : UcanYarasa sınıfı çocuk sınıf (Yarasa sınıfından miras almalı (dolayısıyla Hayvan sınfınıdan miras alır)
 */
class Hayvan {
    public Hayvan() {
        System.out.println("Hayvan yapılandırıcısı(construactor)");
    }
}

class Yarasa extends Hayvan {
    public Yarasa() {
        System.out.println("Yarasa yapılandırıcısı(construactor)");
    }
}

class UcanYarasa extends Yarasa {
    public UcanYarasa() {
        System.out.println("UcanYarasa yapılandırıcısı(construactor)");
    }

    public static void main(String[] args) {
        UcanYarasa uy = new UcanYarasa();
    }
}
