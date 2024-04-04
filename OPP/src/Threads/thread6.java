package Threads;

class Mudur {
    String name = "Müdür1";
    int age = 30;

    public void calis() {
        System.out.println(name + ". şuan çalışıyor");
    }
}

class GenelMudur extends Mudur implements Runnable {
    @Override
    public void calis() {
        System.out.println(name + ". şuan çalışıyor");
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            //this.sleep(); hatalı kullanım (ancak extends Thread olursa mumkun olur!
            //System.out.print("this.getName()+i");//hata (ancak extends Thread olursa mumkun olur!
            try {
                Thread.currentThread().sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "<->" + i);
        }
    }
}

public class thread6 {
    public static void main(String[] args) {
        GenelMudur gm1 = new GenelMudur();
        GenelMudur gm2 = new GenelMudur();
        Thread th1 = new Thread(gm1);
        Thread th2 = new Thread(gm2);

        th1.start();
        th2.start();
    }
}
