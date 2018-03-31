package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<String, Integer>();
        for (String item :
                collectionA) {
            if (result.get(item)==(null)) {
                result.put(item, 1);
            }else {
                Integer number = result.get(item);
                result.put(item, ++number);
            }
        }
        for (String item : object.get("value")) {
            Integer number = result.get(item);
            if (number != null) {
                number -= (number / 3);
                result.put(item, number);
            }
        }
        return result;
    }
}
