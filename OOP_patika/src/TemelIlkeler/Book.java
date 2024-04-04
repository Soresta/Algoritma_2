package TemelIlkeler;

public class Book {
    /*
    Encapsulation ilkesi:
    Sarmalama ilkesi, bir sınıfa ait değişkenlerin veya niteliklerin ancak o sınıfa ait
    metotlar tarafından değiştirilebilmesi ve okunabilmesi ilkesidir. Bu ilke sayesinde
    nesnelerde oluşacak anlamsızlıkların önüne geçilebilir.

    Ayrıca değişkenlere sınıfların dışından erişim olmaması ve bir sınıf içindeki değişkenlerin nasıl
    ve ne kadar olacağının da başka kodlardan saklanmış olması anlamına gelir. Böylelikle biz
    değişkenlerimizi sarmalayarak istenmeyen durumlardan korunacak bir filtre haline dönüştürebiliriz.

    sınıfa ait değişkenlerimizi sarmalayarak, sınıf içerisinde ki metotlar yardımı ile değişkenlerimizi
    koruma altına almak ve kullanıma sunma işlemini belli metotlarla yapılıyor. Bu metotlara sonrasında ismini
    çok duyacağımız Getter ve Setter metotları diyoruz.

    GETTERS VE SETTERS:
    Getter:
    Sınıfımıza ait private değişkenler mevcut. Bu değişkenlere dışarıdan erişebilmek için her bir değişkenimiz için
    Getter metodu yazmalıyız. Nesneye ait bu metot çağrıldığında geriye bir değer döndürmeli ve bu değer bizim istediğimiz
    private değişken olmalı.

    Setter :
    Biz getter metodu ile private olan değişkenimize ulaştık.Peki bu değişkenin değerini değiştirmek istediğimizde
    ne yapmalıyız ? Bir sınıfa ait private bir değişkenin değerini değiştirmek için, setter metodu yazılmalıdır.
    */
    private int sayfaSayisi;
    private String kitapAdi, yazar;

    Book(String kitapAdi, int sayfaSayisi, String yazar) {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        if (sayfaSayisi < 1) {
            this.sayfaSayisi = 10;
        } else {
            this.sayfaSayisi = sayfaSayisi;
        }
    }

    //GETTER
    public int getSayfaSayisi() {
        return this.sayfaSayisi;
    }

    //SETTER
    public void setSayfaSayisi(int sayfaSayisi) {
        if (sayfaSayisi < 1) {
            this.sayfaSayisi = 10;
        } else {
            this.sayfaSayisi = sayfaSayisi;
        }
    }
}
