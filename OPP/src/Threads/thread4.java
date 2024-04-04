package Threads;

public class thread4 extends Thread{
    /*
     • Sadece thread classından kalıtım almak için sadece threadlerle alaklı birşey yaparken olur
      bunun avantajı ise: daha kolay kod yazımı
      örnegin run() yordamının içinde getName() yordamını çağırabilriiz

      Runnable sınfıdan implemnt etmek daha az kod yaılmına yol açar?
     */
    @Override
    public void run(){
        System.out.println("THREAD SINIFDAN KALITIM ALMANIN ÖZELLİKLERİ");
    }

    public static void main(String[] args) {
        thread4 t = new thread4();
        t.start();
        //t.start();//yanlış kullanım 1 thread sadece 1 kere başlatılabilir!
    }
}
