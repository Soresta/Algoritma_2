public class Daire {
    //final keyword: değişkenin önüne yazılınca kalıcı olarak o değere atarız(daha sorna değiştirlemez).
    //bir sabit değişken tanımlanyıorsa değişken hepsi büyük harfle tanımlanır!
    public int r;
    public static final double PI = 3.14;
    public static final String SABIT = "akif";

    public Daire(int r){
        this.r = r;
    }

    public void calcArea(){
        double area = Daire.PI* this.r * this.r;
        System.out.println(area);
    }
}
