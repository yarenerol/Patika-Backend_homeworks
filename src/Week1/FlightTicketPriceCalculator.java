package Week1;

import java.util.Scanner;

public class FlightTicketPriceCalculator {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.print("Mesafeyi kilometre cinsinden girin: ");
        int distance = input.nextInt();

        if (distance <= 0){
            System.out.println("HATA: Mesafe 0 veya daha küçük olamaz!");
            return;
        }

        // Uçuş mesafesi alındı, "distance" değerine atandı.

        double flightPrice = distance * 0.10; // Bu işlemin sonucu indirimsiz uçuş fiyatını verir.

        System.out.print("Yaşınızı giriniz: ");
        int age = input.nextInt();

        if (age < 0){
            System.out.println("HATA: Yaş 0'dan küçük olamaz!");
            return;
        }

        // Kullanıcı yaşı alındı, "age" değerine atandı.

        System.out.print("Yolculuk tipini seçiniz (tek yön (1) veya gidiş-dönüş (2)): ");
        int travelType = input.nextInt();

        if (travelType != 1 && travelType != 2){
            System.out.print("HATA: Yolculuk tipi yalnızca 1 (tek yön) veya 2 (gidiş-dönüş) olabilir!");
            return;
        }

        // Yolculuk tipi alındı, "travelType" değerine atandı.

        // Aşağıda yaş indirimini hesaplayacağız.

        double ageDiscount = 0.0;

        if (age < 12){
            ageDiscount = flightPrice * 0.50;
        } else if (age >= 12 && age < 24){
            ageDiscount = flightPrice * 0.10;
        } else if (age > 65){
            ageDiscount = flightPrice * 0.30;
        }

        //Şimdi yaş indirimli tutarı hesaplayalım.

        double discountedPrice = flightPrice - ageDiscount;

        // Aşağıda gidiş-dönüş indirimi uygulayacağız.

       double travelTypeDiscount = 0.0;

        if (travelType == 2) {
            travelTypeDiscount = discountedPrice * 0.20;
        }

        double totalPrice = (flightPrice-ageDiscount)-travelTypeDiscount;
            System.out.println("Toplam Tutar: " + totalPrice + "TL.");

            input.close();
    }
}
