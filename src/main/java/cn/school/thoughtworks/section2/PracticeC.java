package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<String, Integer>();
        for (String item :
                collection1) {
            String[] array = item.split("[-:\\[\\]]");
            if (array.length > 1) {
                increaseNumber(result, array[0], Integer.parseInt(array[1]));
                continue;
            }
            increaseNumber(result, item, 1);
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
