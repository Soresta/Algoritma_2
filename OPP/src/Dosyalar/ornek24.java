package Dosyalar;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ornek24 {
    // • Ali.txt dosyasında bulunan sayılar içinde asal olanlarını bulup ASAL.txt dosyasına yazan metodu yazınız.
    public static boolean asal(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("ali.txt"));
        FileWriter f1 = new FileWriter("sal.txt");
        PrintWriter p1 = new PrintWriter(f1);

        while (input.hasNextInt()) {
            int sayi = input.nextInt();
            if (asal(sayi)) {
                p1.println(sayi);
            }
        }
        p1.close();
        f1.close();
        input.close();
    }
}

