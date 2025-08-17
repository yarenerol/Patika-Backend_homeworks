package Week4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambdas {
    public static void main(String[] args) {

        // Öncelikle sayıları tuttuğumuz bir arrayList oluşturalım.

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);


        // Şimdi stream ile bu listenin tüm öğelerini gezelim.
        // Ardından lambda ifadesiyle iki katına çıkaralım.
        // Son olarak da bulduğumuz değerleri bir listede toplayalım.

        List<Integer> doubledNumbers = numbers.stream().map(num -> (num * 2)).collect(Collectors.toList());

        // Ve yazdıralım

        System.out.println(doubledNumbers);


    }
}
