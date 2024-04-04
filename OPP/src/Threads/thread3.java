package Threads;

class PrintChar implements Runnable {
    /*
     • Thread sınıfını ve Runnable arayüzünü kullanarak 3 tane iş parçaçğı nesnesi oluşturup ve
       bu nesnelerin ekrana belirliş bir karakteri birden çok kez yazmasını sağlayan programı yazınız
       ve sonuçları gözlemleyini.
     */
    private char CharToPrint;
    private int times;

    public PrintChar(char yazGerKarakter, int defa) {
        this.CharToPrint = yazGerKarakter;
        this.times = defa;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.times; i++) {
            System.out.print(CharToPrint + " ");
        }
    }
}

class PrintNum implements Runnable {
    private int numberToPrint;

    public PrintNum(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
        for (int i = 0; i < numberToPrint; i++) {
            System.out.print(numberToPrint + " ");
        }
    }
}

public class thread3 {
    public static void main(String[] args) {
        /*
        PrintNum pn1 = new PrintNum(10);
        PrintChar pc1 = new PrintChar('A',10);
        PrintChar pc2 = new PrintChar('B',10);

        Thread t1 = new Thread(pn1);
        Thread t2 = new Thread(pc2);
        Thread t3 = new Thread(pc1);

         */
        Thread t1 = new Thread(new PrintChar('A', 15));
        Thread t2 = new Thread(new PrintChar('B', 15));
        Thread t3 = new Thread(new PrintNum(10));

        t1.start();
        t2.start();
        t3.start();
    }
}
