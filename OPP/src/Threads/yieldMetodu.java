package Threads;


class A extends Thread {
    int i = 0;

    public void run() {
        while (true) {
            if (i == 5) return;
            System.out.println("A-" + i);
            if (i == 3) Thread.yield();
            i++;
        }
            /*
              • A hint to the scheduler that the current thread is willing to yield its current use of a processor.
                The scheduler is free to ignore this hint.
              • Yield is a heuristic attempt to improve relative progression between threads that would otherwise
                over-utilise a CPU. Its use should be combined with detailed profiling and benchmarking to ensure
                that it actually has the desired effect.
             */
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("B-" + i);
        }
    }
}

public class yieldMetodu {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();

        a1.start();
        b1.start();
    }
}
