package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<>(collectionA);
        for (String item : object.get("value")) {
            Integer number = result.get(item);
            if (number != null) {
                number -= 1;
                result.put(item, number);
            }
        }
        return result;
    }
}
