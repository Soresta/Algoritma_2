package second;

import first.First;//first pakaeti içinde sadece first sınıfı içe aktar
//import first.* //first paketi içinde bütün classları içe aktarma anlamına gelir

public class Second {
    public static void main(String[] args) {
        First b = new First("Kodluyoruz");
       /* System.out.println(b.str);publice ait
        System.out.println(b.str);protected kullanıldığı için o sınıfa erişim sağlansa dahil farklı bir pakette
        olması sebebiyle protected değişkenler veya metotlar erişim sağlanmaz!
        b.show(); yine sorun çıkartır sebebi ise protected bir metot!

        */

    }
}
