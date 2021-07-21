package ua.training;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> counter = new TreeMap<>();

        List<Integer> test = Arrays.asList(4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7);
        test = new ArrayList<Integer>(test);

        System.out.println(test);

        /*
        for (int i = 0; i < test.size(); i++) {
            int temp = test.get(i);

            if (counter.containsKey(temp)) {
                counter.put(temp, counter.get(temp) +1);
            } else {
                counter.put(temp, 1);
            }
        }
        */

        for (int i : test) {
            counter.computeIfPresent(i, (k, v) -> v += 1);
            counter.putIfAbsent(i, 1);
        }

        System.out.println(counter);
    }
}
