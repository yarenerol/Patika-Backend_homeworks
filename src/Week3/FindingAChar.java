package Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingAChar {

    public static void main(String[] args) {

        //Öncelikle bir ArrayList oluşturalım.

        ArrayList <String> chars = new ArrayList<>();

        // Bu listeye 4 tane harf girelim.

        chars.add("a");
        chars.add("b");
        chars.add("c");
        chars.add("d");

        // Şimdi kullanıcıdan eklenecek 4 harfi alalım.
        // Bunun için önce scanner açalım.

        Scanner input = new Scanner(System.in);

        // Şimdi for döngüsüyle dört kez harf isteyelim.

        for (int i = 1; i < 5; i++) {
            System.out.println(i + ". harfi giriniz: ");
            String charakter = input.nextLine();
            if (chars.contains(charakter)) {
                int index = chars.indexOf(charakter);
                chars.set(index, "found");   // Karakter halihazırda listede mevcutsa bu karakteri found ile değiştiriyoruz.
            } else {
                chars.add(charakter);   //Karakter mevcut değilse de ekliyoruz.
            }
        }

        //Son olarak da oluşan listeyi yazdıralım.

        System.out.println("Final List: \n" + chars);

    }
}
