package Week1;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {

        //Kullanıcıdan yıl girmesini isteyelim.

        Scanner input = new Scanner(System.in);

        System.out.print("Bir yıl giriniz: ");
        int year = input.nextInt();

        // Yıl bilgisi alındı.

        // If bloğuyla koşul oluşturalım.

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Girdiğiniz yıl artık yıldır.");
        } else {
            System.out.println("Girdiğiniz yıl artık yıl değildir.");
        }

        input.close();

    }
}
