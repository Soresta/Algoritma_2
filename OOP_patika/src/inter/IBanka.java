package inter;

public interface IBanka {
    /*not : bir sınıf bir tane atadan kalıtım sağlayabilirken birden çok interfaceden implement edebilir!
    Java'da soyutlamayı sağlamanın bir başka yolu "interface" tanımlamaktır. "interface" 'ler
    abstract sınıflara göre soyutlama oranı çok yüksektir. Çünkü, "interface" içinde sadece soyut
    fonksiyonlar tanımlayabilirsiniz. Metot gövdesi olan normal fonksiyonlar tanımlayamazsınız.

    -interfacelerde yazılan metotların gövdesi olmaz!
    -interfacelerde public veya private yazılmaz program duruma göre ayarlar!
    -boş değere sahip değişken tanımlanmaz
    -final keyword ile kalıcı değiştirilmeyen değişkenler yazılır!
     */

    //String str; hatalı kullanım Ancak String str = null veya String str = "adfa";
    final String hostIdAdress = "127.0.0.1";

    boolean connect(String ipIdress);

    boolean payment(String cardNumber, double price, String expiryDate, String cvc);

}
