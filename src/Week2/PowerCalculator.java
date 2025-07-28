package Week2;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {

//        Önce kullanıcıdan taban ve üs değerlerini alalım.

        Scanner input = new Scanner(System.in);
        System.out.println("Öncelikle baz değeri girin: ");
        int base = input.nextInt();

        System.out.println("Şimdi üs değeri girin");
        int power = input.nextInt();

//        Şimdi aşağıda metodunu tanımladığımız değeri
//        bir değişkene atayarak yazdıralım.


        int result = calculation(base, power);

        System.out.println(base + "^" + power + " sonucu: " + result);
    }

//    Burada işlemi yapan metodu tanımlıyoruz.

    public static int calculation (int base, int power){
        if (power == 0){
            return 1;
        }
        return base * calculation(base, power -1);
    }
}
