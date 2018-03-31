package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<String, Integer>();
        for (String item :
                collection1) {
            if (result.get(item)==(null)) {
                result.put(item, 1);
            }else {
                Integer number = result.get(item);
                result.put(item, ++number);
            }
        }
        return result;
    }
}
