package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<String, Integer>();
        for (String item :
                collectionA) {
            String[] array = item.split("-");
            if (array.length > 1) {
                increaseNumber(result, array[0], Integer.parseInt(array[1]));
                continue;
            }
            increaseNumber(result, item, 1);
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

    private void increaseNumber(Map<String, Integer> result, String item, Integer increment) {
        if (result.get(item) == (null)) {
            result.put(item, increment);
        } else {
            Integer number = result.get(item);
            number += increment;
            result.put(item, number);
        }
    }
}
