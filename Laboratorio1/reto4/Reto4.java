import java.util.*;
import java.util.stream.IntStream;


public class Reto4{
    public HashMap hash;

    public HashMap<String, Integer> almacenarHashMap(List<String> strings, List<Integer> numeros){
        if (claves == null || valores == null) {
        throw new IllegalArgumentException("Las listas no pueden ser nulas");
        }
        if (claves.size() != valores.size()) {
            throw new IllegalArgumentException("Las listas deben tener el mismo tamaño");
        }

        HashMap<String, Integer> map = new HashMap<>();

        IntStream.range(0, claves.size()).forEach(i -> map.putIfAbsent(claves.get(i), valores.get(i)));

        return map;
    }

}