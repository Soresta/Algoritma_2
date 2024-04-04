package inheritance.ornek1;

public class Asistan extends Akademisyen {
    private int ofisSaati;

    public void quizYap() {
        System.out.println("Quiz yapıldı");
    }

    public int getOfisSaati() {
        return ofisSaati;
    }

    public void setOfisSaati(int ofisSaati) {
        this.ofisSaati = ofisSaati;
    }

    public Asistan(String adSoyad, String telefon, String eposta, String bolum, String unvan, int ofisSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.ofisSaati = ofisSaati;
    }

    public void derseGir(String dersSaati){}

}
