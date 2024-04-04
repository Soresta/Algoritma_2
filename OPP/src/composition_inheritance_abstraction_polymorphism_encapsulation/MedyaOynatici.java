package composition_inheritance_abstraction_polymorphism_encapsulation;

/*
    • Problem: Bir medya oynatıcı uygulaması tasarlamak istiyoruz. Bu uygulama, farklı medya türlerini oynatabilir,
    • örneğin müzik dosyaları (MP3), video dosyaları (MP4) ve resim dosyaları (JPEG). Her medya türü farklı özelliklere
    ve işlevlere sahip olabilir. Bu uygulamayı tasarlamak için abstract sınıflar, interface'ler, inheritance ve
    polymorfizmi kullanmanız gerekiyor.

    • Aşağıda bu problemi çözmek için oluşturulacak sınıfları ve ilişkileri detaylı olarak açıklıyorum:
    - MedyaOynatabilir (Interface):

    • Metotlar:
    - oynat(): Medya dosyasını oynatır.
    - duraklat(): Medya dosyasını duraklatır.
    - durdur(): Medya dosyasını durdurur.

    • MedyaDosyasi (Abstract Sınıf):
    • Özellikler:
    - dosyaAdi (String): Medya dosyasının adını temsil eder.
    - dosyaYolu (String): Medya dosyasının yolunu temsil eder.
    • Metotlar:
    - getDosyaAdi(): Medya dosyasının adını döndürür.
    - setDosyaAdi(String dosyaAdi): Medya dosyasının adını ayarlar.
    - getDosyaYolu(): Medya dosyasının yolunu döndürür.
    - setDosyaYolu(String dosyaYolu): Medya dosyasının yolunu ayarlar.

    •MuzikDosyasi (Alt Sınıf):
    Kalıtım: MedyaDosyasi sınıfından türetilir.
    • Özellikler:
    sanatci (String): Müzik dosyasının sanatçısını temsil eder.
    sure (int): Müzik dosyasının süresini temsil eder.
    • Metotlar:
    oynat(): Müzik dosyasını oynatır.
    duraklat(): Müzik dosyasını duraklatır.
    durdur(): Müzik dosyasını durdurur.

    • VideoDosyasi (Alt Sınıf):
    Kalıtım: MedyaDosyasi sınıfından türetilir.
    • Özellikler:
    uzunluk (int): Video dosyasının uzunluğunu temsil eder.
    cozunurluk (String): Video dosyasının çözünürlüğünü temsil eder.
    • Metotlar:
    oynat(): Video dosyasını oynatır.
    duraklat(): Video dosyasını duraklatır.
    durdur(): Video dosyasını durdurur.
 */
interface MedyaOynatabilir {
    void oynat();

    void duraklat();

    void durdur();
}

abstract class MedyaDosyasi {
    private String doysaAdi;
    private String dosyaYolu;

    MedyaDosyasi(String doysaAdi, String dosyaYolu) {
        this.dosyaYolu = dosyaYolu;
        this.doysaAdi = doysaAdi;
    }

    public String getDoysaAdi() {
        return doysaAdi;
    }

    public void setDoysaAdi(String doysaAdi) {
        this.doysaAdi = doysaAdi;
    }

    public String getDosyaYolu() {
        return dosyaYolu;
    }

    public void setDosyaYolu(String dosyaYolu) {
        this.dosyaYolu = dosyaYolu;
    }
}

class MuzikDosyasi extends MedyaDosyasi implements MedyaOynatabilir {
    String sanatci;
    int sure;

    MuzikDosyasi(String dosyaAdi, String dosyaYolu, String sanatci, int sure) {
        super(dosyaAdi, dosyaYolu);
        this.sanatci = sanatci;
        this.sure = sure;
    }

    public void oynat() {
        System.out.println("Müzik Dosyası oynatıldı");
    }

    public void duraklat() {
        System.out.println("Müzik Dosyası duraklatıldı");
    }

    public void durdur() {
        System.out.println("Müzik Dosyası durduruldu");
    }

}

class VideoDosyasi extends MedyaDosyasi implements MedyaOynatabilir {
    int uzunluk;
    String cozunurluk;

    public VideoDosyasi(String doysaAdi, String dosyaYolu, int uzunluk, String cozunurluk) {
        super(doysaAdi, dosyaYolu);
        this.uzunluk = uzunluk;
        this.cozunurluk = cozunurluk;
    }

    public void oynat() {
        System.out.println("Video Dosyası oynatıldı");
    }

    public void duraklat() {
        System.out.println("Video Dosyası duraklatıldı");
    }

    public void durdur() {
        System.out.println("Video Dosyası durduruldu");
    }
}

public class MedyaOynatici {
    public static void main(String[] args) {
        MuzikDosyasi muzik = new MuzikDosyasi("Şarkı.mp3", "/dosya/şarkı.mp3", "Sanatçı", 240);
        VideoDosyasi video = new VideoDosyasi("Video.mp4", "/dosya/video.mp4", 3600, "1080p");

        muzik.oynat();
        muzik.duraklat();
        muzik.durdur();

        video.oynat();
        video.duraklat();
        video.durdur();
    }
}
