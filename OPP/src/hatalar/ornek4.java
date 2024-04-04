package hatalar;

import java.util.Scanner;

public class ornek4 {
    //I/o exceptions (giriş/çıkış) hataları:
    public static void main(String[] args) {
        int a,b;
        Scanner read= new Scanner(System.in);
        try {
            //hatanın çıkması için rakam yerine karakter girilmesi gerekir!
            a = read.nextInt();
            b = read.nextInt();
            System.out.println(a+b);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
