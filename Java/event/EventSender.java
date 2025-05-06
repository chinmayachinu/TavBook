package event;

import java.util.HashMap;
import java.util.Map;

public class EventSender {
    public static void main(String[] args) {
        EventData data = new EventData(
                "123",
                "456",
                "website",
                "US",
                "New York",
                "US",
                "USD",
                "en",
                "en-US");

        System.out.println(data);

        var map = new HashMap<Integer, String>();

        int[] arr = {1,2,3,4,5,6};

        for (int j : arr) {
            map.put(j, "value " + j);
        }

        map.forEach((key, value) -> {
            System.out.println("key => " + key + " value => " + value);
        });
    }
}

