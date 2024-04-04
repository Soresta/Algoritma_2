package composition_inheritance_abstraction_polymorphism_encapsulation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class banka {
    /*
    • Problem: Bir banka hesabı sınıfı oluşturmanız gerekiyor, Bu sınıfın aşağıdaki özelliklere
    ve davranışlara sahip olması gerekmektedir:

    • İki özel veri elemanı olmalı: "hesapNumarasi" (int türünde) ve "bakiye" (double türünde).
    • Hesap numarası ve başlangıç bakiyesi vererek bir banka hesabı nesnesi oluşturulabilmelidir.
    • "bakiyeGoruntule" adında bir metot, mevcut bakiyeyi döndürmelidir.
    • "paraYatir" adında bir metot, hesaba belirli bir miktarda para yatırmalıdır.
    • "paraCek" adında bir metot, hesaptan belirli bir miktar para çekmelidir.
    • Hesapta yeterli bakiye yoksa, işlem gerçekleştirilmemeli ve bir hata mesajı verilmelidir.
    • "hesapOzeti" adında bir metot, hesap hareketlerinin bir özetini döndürmelidir. Hesap hareketleri,
       her para yatırma veya para çekme işleminden sonra güncellenmelidir.
    • Hesap özetinde, her işlem için tarih, işlem türü (para yatırma veya çekme), miktar ve güncel bakiye bilgisi yer almalıdır.

    • Örnek bir hesap özeti:
    Tarih: 08-06-2023 10:30 - Para Yatırma - Miktar: 100.0 - Güncel Bakiye: 200.0
    Tarih: 08-06-2023 11:45 - Para Çekme - Miktar: 50.0 - Güncel Bakiye: 150.0
     */
    int hesapNumarasi;
    double bakiye;
    double fakeBakiye;

    public banka(int hesapNumarasi, double bakiye) {
        this.hesapNumarasi = hesapNumarasi;
        this.bakiye = bakiye;
        fakeBakiye = bakiye;
    }

    public double bakiyeGoruntule() {
        return this.bakiye;
    }

    public void paraYatir(int miktar) {
        this.bakiye += miktar;
        System.out.println("Hesabınıza " + miktar + " para yatırdınız");
        hesapOzeti();
    }

    public void paraCek(int miktar) {
        if (this.bakiye >= miktar) {
            this.bakiye -= miktar;
            System.out.println("Hesabınızdan " + miktar + " Lira çektiniz");
        } else System.out.println("Hesabınızda yeterli bakiye yoktur");
        hesapOzeti();
    }

    public void hesapOzeti() {
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        LocalDateTime now = LocalDateTime.now();
        if (this.bakiye >= fakeBakiye) {
            System.out.println("Tarih: " + now + "-Para Yatırma-Miktar:" + (this.bakiye - fakeBakiye) + "Güncel Bakiye: " + this.bakiye);
            fakeBakiye = this.bakiye;
        } else if (this.bakiye <= fakeBakiye) {
            System.out.println("Tarih: " + now + "-Para Çekme-Miktar:" + (fakeBakiye - this.bakiye) + "Güncel Bakiye: " + this.bakiye);
            fakeBakiye = this.bakiye;
        }
    }

    public static void main(String[] args) {
        banka hesap = new banka(12345, 1000.0);
        hesap.paraYatir(200);
        System.out.println(hesap.fakeBakiye);
    }
}
