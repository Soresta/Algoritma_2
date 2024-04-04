package hatalar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ornek6 {
    //birde fazla trycatch örnek tipi!
    //try catch blokları birde fazla kere kullanalıabilir ve kontrollu şekilde çıkmasına izin verir!
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        try {
        int a = read.nextInt();
        int b = read.nextInt();
            System.out.println(a / b);
        } catch (ArithmeticException e) {
                System.out.println(e);
        } catch (InputMismatchException f) {
            System.out.println(f);
        }finally {
            System.out.println("herzaman gerçekleşir");
        }
    }
}
