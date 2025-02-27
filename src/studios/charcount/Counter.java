package studios.charcount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counter {
    static void characterCount(String myString) {
    HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
    char[] charactersInString = myString.toCharArray();    for (char c : charactersInString) {
        if (charCountMap.containsKey(c)) {
            charCountMap.put(c, charCountMap.get(c) + 1);
        } else {
            charCountMap.put(c, 1);
        }
    }
    for (Map.Entry entry : charCountMap.entrySet()) {
        System.out.println(entry.getKey() + " " + entry.getValue());
    }
}
    public static void main(String[] args) {
        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        characterCount(str);
    }
}