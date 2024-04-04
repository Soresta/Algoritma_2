package inter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tutar giriniz: ");
        double price = input.nextDouble();


        System.out.print("Kart No giriniz: ");
        String cardNumber = input.next();

        System.out.print("Son kullanım tarini giriniz: ");
        String date = input.next();

        System.out.print("Güvenlik kodu giriniz :");
        String cvc = input.next();

        System.out.println("1.A baknası");
        System.out.println("2.B baknası");
        System.out.println("3.C baknası");

        System.out.print("Banka seçiniz: ");
        int selectBank = input.nextInt();

        switch (selectBank){
            case 1:
                Abankasi aPos = new Abankasi("A bankasi","12341234","1234");
                aPos.connect("127.0.0.3");
                aPos.payment(cardNumber,price,date,cvc);
                break;
            case 2:
                Bbankasi bPos = new Bbankasi("B bankasi","43214321","2314");
                bPos.connect("127.0.0.3");
                bPos.payment(cardNumber,price,date,cvc);
                break;

            default:
                System.out.println("Geçerli banka giriniz!");
        }
    }
}
