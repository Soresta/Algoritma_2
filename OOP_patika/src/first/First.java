package first;

public class First {
    /* access modifiers - erişim belirleyiciler:Javada classla metotlara veya değişkenlere ulaşabilmek için
    erişim belirleyiciler kullanılır, erişim belirleyiciler sınıfların metotların veya değişkenlerin önüne
    yazılır , javada 3 adet erişim belirleyicisi vardır:
    1. Private: bu erişim belirleyici kullanınca sadece değişkenin metotdun bulunduğu classta veya blockta kullanılabilir
    başka bir sınıfta veya blockta kullanılamaz! bu erişim belirleyicisi sadece değişkenler ve metotlarda kullanılabilir
    sınıflarda kullanılmaz sebebide şudur root(ana class) erişim sağlanmıyorsa o sınıfın olması olmaması ile aynıdır!
    ileri derslerde inheritance(alt sınıflarda) bu erişim belirleyicisi kullanılabilir!

    2.public: sınıflara değişkenlere ve metotların önüne yazılabilir farklı paketlerden erişmek için kesinlikle
    public erişim belirleyicisi kullanılmalı.public bütün classlardan aynı paket içinde veya içe aktarma yolu ile
    fakrlı paketlerde kullanılabilir

    3.protected: public ile private arasında kalan bir erişim belirleyici(sadece kendi paketi içinde erişime izin veren
    ancak diğer paketler tarafından içe akatarılma yapılsa dahil kullanıma erişim sağlamayan erişim belirleyicisi!
    protected erişim belirleyicis priavte gibi sadece değişkenler ve metotlar önünde kullanılabilir sınıflarda bu yasaktır.

    4.Varsayılan:Eğer yazdığımız kodlarda herhangi bir öğenin önüne erişim düzenleyici yazmazsak, o öğenin erişimi
     ait olduğu paket ile sınırlandırılır. Aynı pakette bulunan başka bir sınıf içinden o öğeye erişilir.


     */
    //private kısmı:
    /*
    private String str ;

    First(String str){
        this.str= str;
    }

    private void showStr(){//sınıf içinde erişebiliriz private değişkenlere veya metotlara!
        System.out.println(this.str);
    }

    void show(){//private olan bir metotdu aynı sınıf içinde başka bir metotta kullanabilir veya erişebiliriz!
        this.showStr();
    }

    */

    //public kısmı
    /*
    public String str;
    public First(String str){
        //eğer coonstruactor veya etotların önüne public yazmassak diğer paketlere import
        // etsek bile bu metota erişemeyiz!
        this.str = str;
    }

     */
    protected String str;
    public First(String str){
        //eğer coonstruactor veya etotların önüne public yazmassak diğer paketlere import
        // etsek bile bu metota erişemeyiz!
        this.str = str;
    }

    protected void  show(){
        System.out.println(this.str);
    }
}
