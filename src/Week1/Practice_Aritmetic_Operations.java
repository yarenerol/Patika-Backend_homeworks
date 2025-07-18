package Week1;

import java.util.Scanner;

public class Practice_Aritmetic_Operations {
    public static void main(String[] args) {

        // Scanner ile kullanıcıdan a, b ve c değerlerini alalım.

        Scanner input = new Scanner(System.in);
        System.out.println("'a' değerini giriniz: ");
        int a = input.nextInt();

        System.out.println("'b' değerini girin: ");
        int b = input.nextInt();

        System.out.println("'c' değerini girin: ");
        int c = input.nextInt();

        // Şimdi aritmetik işlemi yapalım.

        int total = a+b*c-b;

        // Total değerini ekrana yazdırıp işlemi sonlandıralım.

        System.out.println("'a+b*c-b' işleminin sonucu: " + total);

        input.close();
    }
}
