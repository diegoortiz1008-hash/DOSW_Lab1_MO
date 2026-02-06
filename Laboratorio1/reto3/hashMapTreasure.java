package reto3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class hashMapTreasure {
    public HashMap<String, Integer> convertor(List<Map.Entry<String, Integer>> list) {
        return list.stream().collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (first, second) -> second,
                HashMap::new));
    }
}