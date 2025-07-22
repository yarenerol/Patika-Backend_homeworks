package Week1;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        //Kullanıcıdan bir tam sayı isteyelim.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz:");

        int integer = input.nextInt();

        //Şimdi de ondalıklı sayı isteyelim.

        System.out.println("Bir ondalıklı sayı girin");
        double decimal = input.nextDouble();

        // Şimdi int değeri double!a, double'ı int değere çevirelim

        double convertedDecimal = integer;
        int convertedInteger = (int) decimal;

        //Son olarak dönüşümlerimizi bastıralım.

        System.out.println("Tam sayının ondalıklı sayıya dönüştürülmesi: " + convertedDecimal);
        System.out.println("Ondalıklı sayının tam sayıya dönüştürülmesi: " + convertedInteger);
        input.close();
    }
}
