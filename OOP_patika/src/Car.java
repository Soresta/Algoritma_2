class Car {
    //nitelikler(ayrı ayrı tanımla faydalı)
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    //construactor(classla aynı adı taşıyan metot!)
    //void veya returnlu bir dönüş tipi olmamalıdır
    Car(String model,int speed,String color){
        //model = model; //bu durumda yukardaki classa ait olan modele parametre olarak verilen modeli atar
        //ancak bu durum kafa karıştırıcı ve olduğugmuz metotun içinde model adlı bir başka değişken atarsak bunlar
        //karışacak bu yüzden class değişkenlerine veya niteleklerine ifade ederken veya atama yaparken
        //"this" sözcüğünü kullanmalıyız
        this.model = model;
        this.speed = speed;
        this.color = color;

        this.type = "Sedan";
        this.speedLimit = 180;
        System.out.println("Parametreli yapıcı oluştu!");
        //yukardaki yazım tarzı profesyonel yazım atrzıdır ve bu şekil kullanılır!

        //String abc = "akif";
        //this.abc yanlış yazım tarzıdır yukardaki değişken sınıfa ait olmadığı için tanımlaamz!
        //model = farklı bir parametre adı; yazım tarzıda sorun çıkartmaz ancak profesyonel değildir!.
    }
    //alttaki construactor parametresiz ve 2 tane consruactor ancak farklı parametreli olunca overriding(aşırı yükleme) denir

    Car(){
        System.out.println("Boş yapıcı oluştu");
    }

    //behavior(davranışalr)
    void increaseSpeed(int increment) {
        if ((speed + increment) < speedLimit) {
            this.speed += increment;
        }
    }

    void decreaseSpeed(int decrease) {
        if (speed > 0) {
            this.speed -= decrease;
        }
    }

    void printSpeed() {
        System.out.println("Hızınız:\t" + this.speed);
    }

    void printInfo(){
        System.out.println("Model\t\t:" + this.model);
        System.out.println("Color\t\t:" + this.color);
        System.out.println("Speed\t\t:" + this.speed);
        System.out.println("Type\t\t:" + this.type);
        System.out.println("Speed Limit\t:" + this.speedLimit);
    }
}

