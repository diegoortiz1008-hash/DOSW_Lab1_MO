package reto2;
import java.util.ArrayList;
import java.util.List;

public class CarreraParalela {

    public CarreraParalela() {
        System.out.println("Carrera de buses");
    }

    public int numeroMasGrande(List<Integer> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede ser nula o vacía");
        }
        return numeros.stream().max(Integer::compare).get();
    }

    public int numeroMasPequeno(List<Integer> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede ser nula o vacía");
        }
        return numeros.stream().min(Integer::compare).get();
    }

    public String cantidadEsImpar(int cantidad) {
        return (cantidad % 2 != 0) ? "SI" : "NO";
    }

    public String cantidadEsPar(int cantidad) {
        return (cantidad % 2 == 0) ? "SI" : "NO";
    }

    public String mayorEsDivisorDe2(int max) {
        return (max != 0 && 2 % max == 0) ? "SI" : "NO";
    }

    public String mayorEsMultiploDe2(int max) {
        return (max % 2 == 0) ? "SI" : "NO";
    }

    public List<Object> resultadoLista(List<Integer> buses) {
        int max = numeroMasGrande(buses);
        int min = numeroMasPequeno(buses);
        int cantidad = buses.size();

        return List.of(
                max,
                min,
                cantidad,
                mayorEsMultiploDe2(max),
                mayorEsDivisorDe2(max),
                cantidadEsPar(cantidad),
                cantidadEsImpar(cantidad)
        );
    }

    public List<Object> granMeta(List<Integer> firstList, List<Integer> secondList) {
        List<Object> resultado = new ArrayList<>();

        resultado.add("Resultados");

        resultado.add("Lista 1");
        resultado.addAll(resultadoLista(firstList));

        resultado.add("Lista 2");
        resultado.addAll(resultadoLista(secondList));

        return resultado;
    }

    public static void main(String[] args) {
        CarreraParalela cp = new CarreraParalela();

        List<Integer> a = List.of(10, 3, 7);
        List<Integer> b = List.of(2, 4, 6, 9);

        System.out.println(cp.granMeta(a, b));
    }
}
