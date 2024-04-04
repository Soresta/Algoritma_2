package Threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class isParcacigi extends Thread {
    private String cumle;
    private int satir;


    isParcacigi(String cumle, int satir, String isim) {
        super(isim);
        this.cumle = cumle;
        this.satir = satir;
    }

    @Override
    public void run() {
        String[] kelimeler = cumle.split(",");
        System.out.println(this.getName() + " Okunan satir" + satir + " kelime sayisi: " + kelimeler.length);
    }

}


public class ThreadVeDosya {
    public static void main(String[] args) throws FileNotFoundException {
        File dosya = new File("dosya yolu");
        Scanner scan = new Scanner(dosya);
        int i1 = 0, i2 = 0;
        while (scan.hasNext()) {
            String isim = scan.nextLine();
            isParcacigi t1, t2;
            if (isim.contains("Thread1")) {
                t1 = new isParcacigi(isim,i1,"Thread1");
                t1.start();
            } else {
                t2 = new isParcacigi(isim,i2,"Thread2");
                t2.start();
            }
            i1++;
            i2++;
        }
    }
}
