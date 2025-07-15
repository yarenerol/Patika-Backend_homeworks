package Week1;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu giriniz (kg): ");
        double weight = input.nextDouble();

                //Kullanıcıdan kilo bilgisi alındı.

        System.out.print("Boyunuzu giriniz (m): ");
        double height = input.nextDouble();

        double BMIindex = weight / (height*height);

        System.out.print("Vücut kitle indeksiniz: " + BMIindex);

        input.close();

    }
}
