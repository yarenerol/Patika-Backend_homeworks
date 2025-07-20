package Week1;

import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {

        // Kullanıcıdan önce kaç sayı girmek istediğini alalım.

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç sayı girmek istiyorsunuz?: ");
        int n = input.nextInt();

        /* Tüm süreçte kullanacağım değerleri for döngüsüne girmeden, daha başta oluşturuyorum.
            number değeri for döngüsünden geleceği için henüz değer atamadan sadece oluşturuyorum.
            Döngüden gelecek girdi n değerine atanacak.
         */

        int number;
        int min = 0;
        int max = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". değeri giriniz: ");
            number = input.nextInt ();

            /* Şimdi girilen sayıları min ve max değerleriyle karşılaştırıyorum.
            Eğer min'den küçükse min değerine, max'tan büyükse max değerine atanıyor.
            Böylece min ve max sayısı oluşuyor.
             */

            if (i == 1){
                min = number;
                max = number;
            }else if (number > max){
                max = number;
            }else if (number < min){
                min = number;
            }
        }

        // Şimdi elde ettiğimiz min ve max değerlerini yazdıralım.

        System.out.println("Min. değer: " + min);
        System.out.print("Max. değer: " + max);

        input.close();

    }
}
