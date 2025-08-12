package Week3;

import java.util.Map;

public class HashMap {

    public static void main(String[] args) {

        Map<String, Integer> scores = new java.util.HashMap<>();

        scores.put("Cihan", 65);
        scores.put("Buse", 49);
        scores.put("Burak", 89);
        scores.put("Ceren", 13);
        scores.put("Hakan", 78);

        scores.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
