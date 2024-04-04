package Threads;

class isci extends Thread {
    //  • Thread örneği, sonuçları gözlemle.
    public isci(String name) {
        this.setName(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.getName() + " çalışıyor");
        }
    }
}

public class thread5 {
    public static void main(String[] args) {
        isci i1 = new isci("Ahmet");
        isci i2 = new isci("Duhan");

        i1.start();
        i2.start();
    }
}
