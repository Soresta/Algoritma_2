package hatalar;

public class ornek5 {
    //sıfıra bölme hatası divide by zero exception
    public static void main(String[] args) {
        //ne zaman çıkar : payda sıfırsa ve bölme işlemi yapılıyorsa!
        try {
            System.out.println(3 / 3);
        } catch (Exception e) {
            System.out.println(e);//exception objesini yazdır!
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Hata oluşsada oluşmasada finally blocku çalışır!");
        }
    }
}

