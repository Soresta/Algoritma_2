package Threads;


class t1 extends Thread {
    public void run() {
        //stop(),return metotları(thread durdurma veya öldürme).
        for (int i = 0; i < 5; i++) {
            System.out.println("A-" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i == 3)
                return;//sleep(); de kullanılabilir ve bu işlemle bizler threadi sonlandırmış veya öldürmüş oluruz
        }

    }
}

public class thread7 {
    public static void main(String[] args) {
        t1 thread = new t1();
        thread.start();
    }
}
