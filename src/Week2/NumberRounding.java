package Week2;

import java.util.Scanner;

public class NumberRounding {
    public static void main(String[] args) {

        // Öncelikle kullanıcıdan değer alalım.
        Scanner input = new Scanner(System.in);
        System.out.println("Ondalıklı bir sayı girin: ");
        double inputNumber = input.nextDouble();

        // Sonra bu değerleri yuvarlayarak yazdıralım.

        System.out.println("Girdiğiniz sayının aşağı yuvarlanmış hali " + Math.floor(inputNumber));
        System.out.println("Girdiğiniz sayının yukarı yuvarlanmış hali " + Math.ceil(inputNumber));
        System.out.println("Girdiğiniz sayının en yakın tamsayıya yuvarlanmış hali: " + Math.round(inputNumber));

        input.close();
    }
}
