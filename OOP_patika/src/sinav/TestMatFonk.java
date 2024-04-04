package sinav;
class MatFonk{
     static  int katsayi = 361;

    MatFonk(){
        katsayi = 361;
    }
    public static double karekokAl(double deger1){
        return Math.sqrt(deger1);
    }
}

public class TestMatFonk {
    public static void main(String[] args) {
        MatFonk fonk1 = new MatFonk();
        System.out.println(MatFonk.karekokAl(MatFonk.katsayi));
        System.out.println(MatFonk.karekokAl(MatFonk.katsayi));
    }
}
