import java.util.*;
import java.util.stream.Collectors;


public class hasMapTreasure {
    public static Hashtable<String, Integer> crearHashtable(List<Map.Entry<String, Integer>> pares) {
        Hashtable<String, Integer> tabla = new Hashtable<>();

        // Recorrer todos los pares
        for (Map.Entry<String, Integer> par : pares) {
            // Solo añade si la clave NO existe previamente
            // Esto conserva el PRIMER valor encontrado
            if (!tabla.containsKey(par.getKey())) {
                tabla.put(par.getKey(), par.getValue());
            }
        }

        return tabla;
    }

    // ========== MÉTODO COMBINAR MAPAS (TU SEGUNDO COMMIT - CAUSARÁ CONFLICTO) ==========

    /**
     * Combina HashMap y Hashtable en un solo mapa.
     * En caso de conflicto, PRIORIZA los valores del Hashtable.
     * <p>
     * NOTA: El Estudiante A creará un método con el mismo nombre.
     * Esto causará un CONFLICTO en Git que deberán resolver.
     *
     * @param hashMap   HashMap a combinar
     * @param hashTable Hashtable a combinar (tiene prioridad en conflictos)
     * @return HashMap combinado con prioridad Hashtable
     */
    public static HashMap<String, Integer> combinarMapas(HashMap<String, Integer> hashMap,
                                                         Hashtable<String, Integer> hashTable) {
        HashMap<String, Integer> resultado = new HashMap<>();

        // Paso 1: Añadir todos los elementos del HashMap
        resultado.putAll(hashMap);

        // Paso 2: Añadir/sobrescribir con elementos del Hashtable
        // putAll sobrescribe valores existentes, dando prioridad al Hashtable
        resultado.putAll(hashTable);

        return resultado;
    }

    // ========== MÉTODO ESTUDIANTE B: Ordenamiento Ascendente (TU TERCER COMMIT) ==========

    /**
     * Ordena las claves de forma ascendente antes de imprimir.
     * Usa Streams para el procesamiento.
     *
     * @param mapa Mapa a procesar e imprimir
     */
    public static void imprimirOrdenado(Map<String, Integer> mapa) {
        mapa.entrySet().stream()
                // sorted() ordena las entradas por clave de forma ascendente (alfabético)
                .sorted(Map.Entry.comparingByKey())
                // forEach imprime cada entrada
                .forEach(entry -> {
                    System.out.println("Clave: " + entry.getKey() + " | Valor: " + entry.getValue());
                });
    }

    public static void procesarYMostrarTesoro(HashMap<String, Integer> hashMap, Hashtable<String, Integer> hashTable) {
        // Paso 1: Combinar ambos mapas (Hashtable sobrescribe HashMap)
        Map<String, Integer> combinado = new HashMap<>();
        combinado.putAll(hashMap);
        combinado.putAll(hashTable); // Valores del Hashtable tienen prioridad

        // Paso 2: Procesar con Streams API
        Map<String, Integer> resultado = combinado.entrySet().stream()
                // sorted() - Ordenar por clave de forma ascendente (alfabético)
                .sorted(Map.Entry.comparingByKey())
                // Collectors.toMap() - Convertir stream a mapa con transformaciones
                .collect(Collectors.toMap(
                        // Lambda 1: Transformar clave a MAYÚSCULAS
                        entry -> entry.getKey().toUpperCase(),

                        // Lambda 2: Mantener valor sin cambios
                        Map.Entry::getValue,

                        // Lambda 3: Resolver conflictos (no debería ocurrir aquí)
                        (valor1, valor2) -> valor2,

                        // Constructor: Usar LinkedHashMap para mantener el orden de inserción
                        LinkedHashMap::new
                ));

        // Paso 3: Imprimir resultado formateado
        System.out.println("\n=== TESORO ENCONTRADO ===");
        resultado.forEach((clave, valor) ->
                System.out.println("Clave: " + clave + " | Valor: " + valor)
        );
    }
}