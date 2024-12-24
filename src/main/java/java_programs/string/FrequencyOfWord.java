package java_programs.string;

import java.util.*;

// Find the frequency of a word in a sentence
public class FrequencyOfWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strTemp = "Marco is all about violence haha haha haha";

        String obj = new String("Hello world");
        System.out.println(obj);

        String[] arr = strTemp.split("[\\s\\,\\.]");

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String word : arr) {
            if (map.containsKey(word)) {
              map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
//        Set countSet = map.entrySet();
//        for(String x : countSet)

    }
}
