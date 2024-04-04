package composition_inheritance_abstraction_polymorphism_encapsulation;

class Aile {
    //Compostion örneği: Aile ve Toplum Sınıfıları olsun, her sınıfa ait özellikleri ve metotları olsun
    // toplum sınıfı aile sınıfından compostion alsın.
    public String anne, baba, cocuk1, cocuk2;

    public Aile(String anne, String baba, String cocuk1, String cocuk2) {
        this.anne = anne;
        this.baba = baba;
        this.cocuk1 = cocuk1;
        this.cocuk2 = cocuk2;
    }

    public void isYap(String ebeveyn) {
        if (ebeveyn.equals(this.anne)) System.out.println("yemek yaptı");
        else if (ebeveyn.equals(this.baba)) System.out.println("markete gitti");
        else System.out.println("İş yapılmadı!");
    }

    public void iseGit() {
        System.out.println("Baba işe gitti....");
    }

    public void oyna() {
        System.out.println("Çoçuklar oyun oynıoyr...");
    }
}

class Toplum {
    public String isim;
    Aile a1 = new Aile("Rümeysa", "Ahmet", "Naz", "Nur");//composition;

    public Toplum() {
        isim = "Türk toplumu";
    }

    public static void main(String[] args) {
        Toplum t1 = new Toplum();
        System.out.println(t1.a1.cocuk1);
        t1.a1.iseGit();
        t1.a1.oyna();
        System.out.println(t1.isim);
    }
}


