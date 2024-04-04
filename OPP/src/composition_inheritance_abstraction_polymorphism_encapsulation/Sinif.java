package composition_inheritance_abstraction_polymorphism_encapsulation;

public class Sinif {
    //OOP temelleri örnek :
    public int ogrenciSayisi ;
    public String dersinAdi;
    public String hocaAdi;
    public boolean hocaSinifta;
    public Sinif(String dersinAdi, String hocaAdi,int ogrenciSayisi,boolean hocaSinifta){
        this.dersinAdi = dersinAdi;
        this.hocaAdi = hocaAdi;
        this.ogrenciSayisi = ogrenciSayisi;
        this.hocaSinifta = hocaSinifta;
    }

    public void dersAnlat(){
        if(this.hocaSinifta) System.out.println("Hoca sınfıta ders işlenebilir!");
        else System.out.println("Hoca sınıfta bulunmamakta ders işlenemez!");
    }

    public static void main(String[] args) {
        Sinif s1 = new Sinif("Algoritma","Taner TUNCER",60,true);
    }
}
