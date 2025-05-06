import java.util.HashMap;
import java.util.Map;

public class PolymorphismOverloading {
    /*
     *  Method overloading can be done in two ways :-
     *  1. by changing the number of method arguments
     *  2. by changing the return type
     *
     * Note :- In java method overloading is not possible by changing the return type of the method only.
     *
     */

    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.sum(5, 4));
        System.out.println(addition.sum(1, 234, 5));
        System.out.println(addition.sum((long)23, 2));

        String a = "aaaa";
                //"axxaxa";
                //"acbcbba";

        System.out.println(minNumberToBeDeleted(a));
    }

    private static int minNumberToBeDeleted(String a) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0 ; i< a.length(); i++) {
            if (map.containsKey(a.charAt(i))) {  // if map contains the key already then increment the count
                Integer i1 = map.get(a.charAt(i)); // get the value of the key
                map.put(a.charAt(i), ++i1); // increment the key value
            } else {
                map.put(a.charAt(i), 1);
            }
        }

        System.out.println(map);

        int count = 0;
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());

            if (entry.getValue() % 2 != 0) {
                count++;
            }

        }

        System.out.println("count is => " + count);

        return count;
    }

}

class Addition {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    long sum(long a, int b) {
        return a + b;
    }
}
