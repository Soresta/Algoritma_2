package Threads;
    /*
       • Uygulama: Ekrana ilk 1.000.000 asal sayıdan 1 saniye boyunca okuyabildiği kadar
         asal sayıyı bulup yazdıran java kodunu yazınız?
    */
class AsalSayi extends Thread {
    public static final int MAKS_Asal = 1000000;
    public boolean bittimi = false;

    public void run() {
        int[] asallar = new int[MAKS_Asal];
        int sayi = 0;
        for (int i = 2; i < MAKS_Asal; i++) {
            if (bittimi) return;
            boolean asal = true;
            for (int j = 0; j < sayi; j++) {
                if (i % asallar[j] == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal) {
                asallar[sayi++] = i;
                System.out.println("Bulunan asal: " + i);
            }
        }
    }
}

public class AsalSayiBul {
    public static void main(String[] args) {
        AsalSayi calcuator = new AsalSayi();
        calcuator.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Bir hata oluştu");
        }
        calcuator.bittimi = true;
    }
}
