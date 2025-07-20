package Week1;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {

        // Scanner ile kullanıcıdan kaç satır bastırılacağının değerini alalım.

        Scanner input = new Scanner (System.in);
        System.out.print("Kaç satırlık ters üçgen çizmek istiyorsunuz?: ");
        int line = input.nextInt();

        /* Şimdi for döngüsüyle yıldızları bastıralım.
        Ters üçgen olacağı için sayı büyümek yerine küçülmeli.
         */
        for (int i = line; i >=1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();

            input.close();

        }
    }
}
