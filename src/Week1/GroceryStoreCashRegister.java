package Week1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GroceryStoreCashRegister {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilo armut almak istiyorsunuz? (kg cinsinden girin): ");
        int pear = input.nextInt();
                // Kaç kilo armut alınacağı öğrenildi

        System.out.print("Kaç kilo elma almak istiyorsunuz? (kg cinsinden girin): ");
        int apple = input.nextInt();
                // Kaç kilo elma alınacağı öğrenildi

        System.out.print("Kaç kilo domates almak istiyorsunuz? (kg cinsinden girin): ");
        int tomato = input.nextInt();
                // Kaç kilo domates alınacağı öğrenildi

        System.out.print("Kaç kilo muz almak istiyorsunuz? (kg cinsinden girin): ");
        int banana = input.nextInt();
                // Kaç kilo muz alınacağı öğrenildi

        System.out.print("Kaç kilo patlıcan almak istiyorsunuz? (kg cinsinden girin): ");
        int eggplant = input.nextInt();
                // Kaç kilo patlıcan alınacağı öğrenildi

        double PearPrice = pear * 2.14;
        double ApplePrice = apple * 3.67;
        double TomatoPrice = tomato * 1.11;
        double BananaPrice = banana * 0.95;
        double EggplantPrice = eggplant * 5.00;

        double Total = PearPrice + ApplePrice + TomatoPrice + BananaPrice + EggplantPrice;

        System.out.print("Toplam Tutar: " + Total);

        input.close();


    }
}
