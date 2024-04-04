package Threads;

/*
     • eğer ki thread classını extends etmessek runnable sınıfını implement etmemiz gerekir.
       class isparcacigi extends Thread {} yerine -  class isparcacigi implements Runnable
*/
class isparcacigi implements Runnable {
    int i;

    public isparcacigi(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        for (int j = 0; j < i; j++) {
            System.out.println("Merhaba iş parça cığı!" + j);
        }
    }
}

public class thread1 {
    public static void main(String[] args) {
        //isparcacigi is1 = new isparcacigi(5);//extends thread durumudna böyle
        //isparcacigi is2 = new isparcacigi(10);
        Thread t1 = new Thread(new isparcacigi(5));
        Thread t2 = new Thread(new isparcacigi(10));
        t1.start();
        t2.start();

    }
}
