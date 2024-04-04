package composition_inheritance_abstraction_polymorphism_encapsulation;

public class TestSimpleCircle {
    //circle classı oluştur ve classa 2 tane farklı constractor ver!
    public static void main(String[] args) {
        SimpleCricle daire1 = new SimpleCricle(32.32);
        System.out.println(daire1.radius);
        System.out.println(daire1.getArea());
        System.out.println(daire1.getPerimeter());
        daire1.setRadius(324);
        System.out.println(daire1.radius);
    }
}

class SimpleCricle {
    double radius;
    // • Oluşturucu Metotlar :
    SimpleCricle() {
        radius = 1;
    }
    SimpleCricle(double newRadius) {
        radius = newRadius;
    }

    // • Davranışlar(behavior-method)
    double getArea() {
        return radius * radius * Math.PI;
    }
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    void setRadius(int newRadius) {
        radius = newRadius;
    }
}

