package Week3;

import java.util.ArrayList;
import java.util.Collections;

public class ClosestNumbers {

    public static void main(String[] args) {

        /* Öncelikle ArrayList'imiz oluşturup içine benzersiz (tekrarsız) 10 pozitif eleman ekleyelim.*/

        ArrayList <Integer> numbers = new ArrayList<>();

        numbers.add(8);
        numbers.add(12);
        numbers.add(3);
        numbers.add(22);
        numbers.add(18);
        numbers.add(74);
        numbers.add(44);
        numbers.add(50);
        numbers.add(15);
        numbers.add(54);

        System.out.println("Liste: " + numbers);


        /* Tüm sayıları birbiriyle karşılaştırmak çok zaman alacaktır.
        Bunun yerine bu sayıları küçükten büyüğe sıralayalım. Bu sayede
        sadece yan yana olan sayıları kontrol edersek istediğimiz iki rakama
        daha çabuk ulaşabiliriz.
         */

        Collections.sort(numbers);

        System.out.println("Sayıların küçükten büyüğe sıralanmış hali: " + numbers);

        //Şimdi de yan yana olan sayıları karşılaştıralım. Bunun için index numaralarıyla işlem yapalım.
        //For döngüsü ile tüm listeyi gezelim.

        int num1 = 0;     //Num değerlerini ve minDifference değerini dışarıda oluşturdum ki bastırırken döngülerin içinde kalmasın.
        int num2 = 0;
        int minDifference = Integer.MAX_VALUE;


        for (int i = 0; i < numbers.size()-1; i++) {

             int difference = numbers.get(i+1) - numbers.get(i);   //Birbirine komşu indekslerde yer alan rakamların farkı.


            if (minDifference > difference) {

                num1 = numbers.get(i);    //Sayıları num1 ve num2 değerlerine atarayarak saklıyorum.
                num2 = numbers.get(i+1);

                minDifference = difference;   //eğer referans minDifferent değeri iki sayı arasındaki fark olan difference'tan büyükse yeni minDifference bu olacak.
            }
        }

        System.out.println("Birbirine en yakın iki eleman: " + num1 + " ve " + num2);
    }
}
