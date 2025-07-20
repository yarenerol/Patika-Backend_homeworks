package Week1;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        //Kullanıcıdan kontrol edilecek sayıyı alalım.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı girin: ");
        int number = input.nextInt();

        /* Şimdi bu sayının kendinden küçük tüm sayılarla modunu alarak
        hangilerine kalansız bölündüğünü bulmalıyız. Bunun için
        bir "total" değeri oluşturalım ki kalansız bölünenleri bu toplama
        ekleyerek devam edelim.
         */

        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number %i == 0){
                total += i;
            }else;
        }

        // Şimdi toplamı koşula sokalım.

        if (total==number){
            System.out.println(number + " bir mükemmel sayıdır.");
        }else {
            System.out.println(number + " bir mükemmel sayı değildir.");
        }
        input.close();
    }
}
