package inheritance.ornek1;

public class Main {
    public static void main(String[] args) {
        //not:javada bir sınıf sadece bir sınıfta kalıtım yapabilir birden fazla sınıftan kalıtım yapamaz!
        Calisan c1 = new Calisan("Naz Dağ","49353","naz@gmail.com");


        //Akademisyen ak1 = new Akademisyen("Sorest Nawa", "55555", "nawa@gmail.com","Bilgisayar mühendisliği", "doçent");

        //Memur m1 = new Memur("Charles ivern","41324","Charles@gmail.com","Ekonomi","9:00-18:00");

        Asistan as1 = new Asistan("Akif Karaca", "0555222", "sorest@gmail.com",
                "Bilgisayar mühendisliği", "Porfesör", 8);

        GuvenlikGorevlisi g1 = new GuvenlikGorevlisi("Bjorn ironside","999","vikings@gmail.com",
                "savaş bilimleri","9:00-18:00","vikinlerBelgesi");

        //Calisan cm1 = new Memur("No name","3012312","noname@gmail.com","yazılım mühendisliği","9:00-18:00");
        //yukardaki nesne calisan sınıfından yeni memur nesnesi ancak bu nesne calisan sınıfına ait herşeyi erişim sağlarken
        //memur sınıfa ait özeliiklere erişim sağlayamaz.(polymorfizim ile alakalı)
        //m1.calis(); erişim sağlayamaz kullanmaz
        //m1.yemekHane();

        System.out.println(as1.getAdSoyad());
        //ak1.giris();//Akademisyen sınıfında bu metot yok ancak Calisan sınıfndan miras alıyor!
        //ak1.derseGir();
        System.out.println(g1.getBelge());
        g1.nobet();
        g1.yemekHane();
        g1.giris();

        /*Metot overloading:
        Aynı isimde farklı parametre listesi (sayı, tür ya da sıraları farklı olan parametreler) ile
        birden fazla yöntem kodlanmasını Yöntemlerin Aşırı Yüklenmesi ( Method Overloading) olarak adlandırmıştık.

        Overriding:
        öntem Geçersiz Kılma ise bir alt sınıfın içine doğrudan ya da dolaylı ata sınıflarından gelen bir
        (ya da daha fazla) yöntemin aynısının (aynı yöntem adı ve aynı parametre listesi) kodlanmasına verilen addır.

        Yöntem geçersiz kılma ile ilgili olarak bir noktanın gözden kaçırılmaması gerekir: alt sınıfa kodlanan yöntem,
        ata sınıftaki yöntemle aynı ad ve parametre listesine sahiptir, ancak ata sınıftaki yöntemle aynı kodları
        içermemelidir! Zaten alt sınıfa ata sınıftaki yöntemin tamamen aynısını kodlamak elbette çelişkili, hatta
        saçma ve anlamsız olacaktır.

         */

        g1.giris("10.00");//metot overloading örneği
        g1.giris("10.00","18.00");//metot overloading örneği

        System.out.println("/--------------------------------------------/");
        //Overriding örnekleri
        /*not: overriding işleminde bir alt sınıfın içinde ata sınıfta iptal edilen (overriding) yapılan bir metot varsa
        ata sınıfındaki metodu görmezden gelir!, ve bu şekildedir ve alt sınıfı bir farklıa lt sınıftan miras alıyorsa
        bu işlem bu şekil devam eder ve önce olduğu sınfıa bakar sonra kalıtım aldığı alt sınıfa sonra ise ata sınıfa vs...
         */
       //m1.giris();
       /*güvenliGörevlisi sınfıısı memeur sınıfından kaltıım almasına rağmen içinde bulunan giriş metotdu üst sınıflarından
        override edilmiş bu sebepten dolayı içinde bulunan metodu çalıştırır!
        */
       g1.giris();


       /* Polimorfizim:(çok biçimlilik):

        */

        //Calisan calisan1 = new Akademisyen("Sorest Nawa", "55555", "nawa@gmail.com","Bilgisayar mühendisliği", "doçent");

        //calisan1.giris();//polymorfizim!

        ////ayın atadan olan sınıfları nesne olarak toplayabilirin
        //Calisan[] calisanListe = {c1,cm1,m1,ak1,as1};

        //for (Calisan c:calisanListe
        //     ) {
        //   c.giris();

        //}


        /*
        abstraction (soyutlama)
         */

        OgretimGorevlisi og1 = new OgretimGorevlisi("Dayya duyhu","432","t@gmail.com","CENG",
                "prof","302");

        og1.derseGir("3.00");


    }
}
