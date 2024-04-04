package composition_inheritance_abstraction_polymorphism_encapsulation;

class ArabaGettersVeSetters {
    /*
    • Kapsülleme (encapsulation):
    -Kapsüllemenin anlamı; "hassas" verilerin kullanıcılardan gizlendiğinden emin olmaktır.

    • Bunu başarmak için şunları yapmalısınız:
    1-sınıf değişkenlerini/niteliklerini şu şekilde bildirin(tanımlayın): private.
    2-Bir değişkenin değerine erişmek ve bu değeri güncellemek için genel get ve set yöntemleri(metotlarını).
     sağlayın.

    • Neden Kapsülleme?
    -Sınıf niteliklerinin ve yöntemlerinin daha iyi kontrolü.
    -Sınıf nitelikleri salt okunur (yalnızca yöntemi kullanıyorsanız get) veya
    salt yazılır(yalnızca yöntemi kullanıyorsanız set) yapılabilir.
    -Esnek: Programcı kodun bir bölümünü diğer bölümleri etkilemeden değiştirebilir
    Artan veri güvenliği
     */
    private String arabaAdi;
    private int fiyat;
    private String model;
    private int motorGucu;

    public ArabaGettersVeSetters(String arabaAdi, int fiyat, String model, int motorGucu) {
        this.arabaAdi = arabaAdi;
        this.fiyat = fiyat;
        this.model = model;
        this.motorGucu = motorGucu;
    }

    public String getArabaAdi() {
        return arabaAdi;
    }

    public void setArabaAdi(String arabaAdi) {
        this.arabaAdi = arabaAdi;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMotorGucu() {
        return motorGucu;
    }

    public void setMotorGucu(int motorGucu) {
        this.motorGucu = motorGucu;
    }

    public static void main(String[] args) {
        ArabaGettersVeSetters araba = new ArabaGettersVeSetters("BMW", 500000, "2023", 3400);
        araba.setFiyat(600000);
        araba.setModel("2022");
        System.out.println(araba.getFiyat());
        System.out.println(araba.getModel());
    }
}


