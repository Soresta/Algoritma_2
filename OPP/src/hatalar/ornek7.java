package hatalar;

import java.util.Scanner;

public class ornek7 {
    //Dizi boyutu ile ilgili hata!
    //ve iç içe try catch yapısı
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        /*
        int[] dizi = {1,2,3,4,5};//5 eleman! 4 indexten oluşur
        try {
            System.out.println(dizi[2]);//22 indiste elemanı istiyor!
            try {
                int a = read.nextInt();
                int b = read.nextInt();
                System.out.println(a/b);
            }catch (Exception f){
                System.out.println(f);
            }finally {
                System.out.println("İçerdeki trycatch bitti!");
            }
        }catch (Exception e){
            System.out.println(e);//java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 5
            System.out.println(e.getMessage());
        }
         */

        // 2 kere bir hatayı test etmek ve finally içinde trycatch örneği!

        int[] dizi = {1, 2, 3, 4, 5};//5 eleman! 4 indexten oluşur
        try {
            System.out.println(dizi[22]);//22 indiste elemanı istiyor!
        } catch (Exception e) {
            System.out.println(e);//java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 5
            System.out.println(e.getMessage());
        } finally {
            try {
                int a = read.nextInt();
                int b = read.nextInt();
                System.out.println(a / b);
            } catch (Exception f) {
                System.out.println(f);
            } finally {
                System.out.println("program devam etsin!");
            }
        }
    }
}
