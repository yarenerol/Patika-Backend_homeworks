package Week3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfAWord {

    public static void main(String[] args) {

        //Öncelikle kullanıcıdan frekansı hesaplanacak kelimeyi alalım.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String word = input.nextLine().toLowerCase(); // Burada tüm harfleri küçük harfe çevirerek case sensitivity olayını ortadan kaldırdık.

        //Şimdi bir HashMap oluşturarak bu değerleri içine atalım.
        // Bu HashMap hem karakteri, hem de harfin kaç kez tekrar ettiği bilgisini tutsun.

        HashMap <Character, Integer> frequencyMap = new HashMap<>();

        // Şimdi kelimedeki harfleri for ile gezerek öncelikle karakter olup olmadığını tespit edelim.

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

             if (Character.isLetter(ch)) {
                 if (frequencyMap.containsKey(ch)) {
                     frequencyMap.put(ch, frequencyMap.get(ch)+1);  // Mevcutsa value'yu 1 artırır.
                 } else {
                     frequencyMap.put(ch, 1);  // Mevcut değilse value'yu 1 olarak başlatır.
                 }
             }
        }

        // Şimdi de map'i yazdırarak sonucu görelim.
        // Satır satır yazdırmak için for each kullanacağız.

       for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
           System.out.println(entry.getKey() + " : " + entry.getValue());
       }

       input.close();
    }
}
