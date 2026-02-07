package reto4;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Reto4{
    public HashMap hash;

    public HashMap<String, Integer> almacenarHashMap(List<String> strings, List<Integer> numeros) {
        if (strings == null || numeros == null) {
            throw new IllegalArgumentException("Las listas no pueden ser nulas");
        }
        if (strings.size() != numeros.size()) {
            throw new IllegalArgumentException("Las listas deben tener el mismo tamaño");
        }

        HashMap<String, Integer> map = new HashMap<>();
        IntStream.range(0, strings.size()).forEach(i -> map.putIfAbsent(strings.get(i), numeros.get(i)));
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

    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Oro", 3);
        mapa.put("Plata", 1);

        Reto4 reto = new Reto4();
        reto.mostrarClavesMayusculasConValoresCompleto(mapa);
    }
}