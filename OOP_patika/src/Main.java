public class Main {
    public static void main(String[] args) {
        //obje oluşturma syntax: ClassName objectName = new ClassName(parametres);
        //nesneler!
        Car audi = new Car("Audi",130,"blue");

        System.out.println(audi.model +" Hızı: "+audi.speed);
        audi.printInfo();


        Car bmw = new Car();
        bmw.model = "BMW";
        bmw.speed = 20;
        bmw.increaseSpeed(70);
        bmw.increaseSpeed(145);
        System.out.println(bmw.model +" Hızı: "+bmw.speed);


        Car mercedes = new Car();
        mercedes.model = "Mercedes";
        mercedes.speed = 40;
        mercedes.printSpeed();

    }
}
