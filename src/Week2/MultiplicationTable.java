package Week2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        //Öncelikle kullanıcıdan üst sınır değerini alalım.

        Scanner input = new Scanner(System.in);
        System.out.println("Çarpım tablosunda görmek istediğiniz üst sınırı belirtin: ");
        int upperLimit = input.nextInt();

        // Şimdi bu üst değeri kullanarak iç içe döngülerle tabloyu oluşturalım.

        for (int i = 1; i < upperLimit; i++) {
            for (int j = 1; j < upperLimit; j++) {
                System.out.printf("%-4d", i*j);
            }
            System.out.println();
        }
    }
}
