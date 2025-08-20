package Week5;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ahmet", "Ayşe", "Mehmet", "Zeynep");  // Method Refereence ders videosundaki gibi .asList ile ekledim.

        names.forEach(System.out::println);  // for-each ile yazdırıyoruz.
    }
}
