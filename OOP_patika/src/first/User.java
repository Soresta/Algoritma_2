package first;

public class User {
    /* konu: static kod blokları {}
       Sınıf değişkenlerinin ilk değerlerinin verilmesi için kurucu metotlar kullanabiliriz. Ancak sınıfa ait statik
       değişkenlerinin ilk değerlerini kurucu içinde vermeye çalışmak yanlış olabilir. Çünkü sınıf değişkenleri,
       hiç nesne oluşturulmamış olsa da kullanılabilmektedir. Sınıf değişkenleri ile ilgili olarak bir defaya özel
       olmak üzere işletilmesi istenen kod kesimleri static kod bloklarında kodlanabilir. Static kod blokları, sınıf
       belleğe yüklendiği anda işletilir. Böylece sınıf değişkenleri bellekte oluşturuldukları anda ilk değerlerini
       almış olurlar.
     */

    public String name;
    public static int counter;

    /* aşşağıda ki yazım çalışacaktır ancak nesne bulunmadığı takdirde çalışmaz ve her nesne oluşunca çalışır
    ancak static yazılırsa önüne sadece 1 kere çalışır her nesne oluşunca çalışmaz! ikiside statik bloktur birisi her
    nesne oluşumunda çalışır diğeri ise sadece 1 kere çalışır!
    static {System.out.println("ben bir static kod bloğuyum");}
    {System.out.println("ben bir static kod bloğuyum");}
     */

    static {
        int random = (int) (Math.random() * 10);
        //System.out.println("ben bir static kod blouğum");
        //System.out.println(random);
        System.out.println("Random sayı:"+random);
        counter = random;
    }

    public User(String name) {
        this.name = name;
        counter++;
    }
}
