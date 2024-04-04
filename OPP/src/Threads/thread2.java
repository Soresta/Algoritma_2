package Threads;

public class thread2 implements Runnable{
    // • Runnable arayüzünü(interface) implement etme örneği.
    @Override
    public void run(){
        System.out.println("Thread çalışıyor");
    }

    public static void main(String[] args) {
        thread2 is1 = new thread2();//görev
        Thread t1 = new Thread(is1);
        t1.start();
    }
}
