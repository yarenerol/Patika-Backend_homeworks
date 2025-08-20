package Week5.Enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Kullanıcıdan sorgulanacak günü alalım

        Scanner input = new Scanner(System.in);

        System.out.println("Choose a day to see the working shifts: ");
        String dayInput = input.nextLine().trim().toUpperCase();

        // Aranan günü for each döngüsünde aratacağım. Bunun için döngüyü kırmak adına boolean değer oluşturalım.

        boolean found = false;

        // For döngüsüyle enum'ı gezelim.

        for (WeekDays weekDays : WeekDays.values()) {
            if (weekDays.name().equals(dayInput)) {
                System.out.println("Working shift of the " +weekDays.name() + " is " + weekDays.getShiftHours());
                found = true;
                break;
            }
        }

        if (! found) {      // Geçersiz giriş için bir hata tespit döngüsü oluşturalım.
            System.out.println("Invalid entry!");
        }

    }
}
