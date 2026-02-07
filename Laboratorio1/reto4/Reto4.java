import java.util.*;
import java.util.stream.Collectors;
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

    public Hashtable<String, Integer> unionMapTable(HashMap<String, Integer> a, Hashtable<String, Integer> b) {
        Hashtable<String, Integer> result = new Hashtable<>(b);
        a.forEach((key, value) -> result.put(key, value));
        return result;
    }

    public static Map<String, Integer> clavesEnMayusculas(Map<String, Integer> mapa) {

        return mapa.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        e -> e.getKey().toUpperCase(),
                        Map.Entry::getValue,
                        (v1, v2) -> v1               
                ));
    }

    public static List<Map.Entry<String, Integer>> ordenarValoresMenorAMayor(Map<String, Integer> mapa) {
        return mapa.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());
    }

    public void mostrarClavesMayusculasConValoresCompleto(Map<String, Integer> mapa) {
        Map<String, Integer> mapaMayusculas = clavesEnMayusculas(mapa);
        List<Map.Entry<String, Integer>> ordenados = ordenarValoresMenorAMayor(mapaMayusculas);
        System.out.println("Resultado completo:");
        ordenados.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}