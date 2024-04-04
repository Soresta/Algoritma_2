package first;

public class MainFirst {
    public static void main(String[] args) {
        //private
        First a = new First("Hello World");
       /* System.out.println(a.str); hata!, First classında olan str niteliğine erişim sağlanamaz private anahtarı kullanılmış!
       a.showStr();hata, metotlarda değişkenler gibi private ise sadece bulunduğu sınıftan erişim sağlanabilir1
       a.show();
       */

        //protected kısmı
        //protected olmasına rağmen burada değişkenleri veya metotları kullanabiliriz(aynı paket)
        System.out.println(a.str);
        a.show();
    }
}
