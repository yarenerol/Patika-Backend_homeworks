package Week2;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

//        Kullanıcıdan sorgulanacak sayıyı alalım.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı girin: ");
        int number = input.nextInt();

//        Şimdi iç içe if döngüleriyle asal sayı olup olmadığını konrol edelim.

        if (number > 1){
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

//            Burada da asal sayı olup olmadığına göre sonucu bastıralım.

            if (isPrime){
                System.out.println(number + " bir asal sayıdır.");
            }else{
                System.out.println(number + " bir asal dayı DEĞİLDİR!");
            }
        }

    }
}
