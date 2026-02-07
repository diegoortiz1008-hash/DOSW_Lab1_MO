package reto5;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto5 {

    public Set<Integer> metodoHashSet(List<Integer> numeros) {

        return numeros.stream()
                .filter(n -> n % 3 != 0)         
                .collect(Collectors.toCollection(HashSet::new));
    }
    public Set<Integer> metodoTreeSet(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public TreeSet<Integer> unirColecciones(List<Integer> listaHashSet, List<Integer> listaTreeSet) {
        Set<Integer> hashSetFiltrado = metodoHashSet(listaHashSet);
        Set<Integer> treeSetFiltrado = metodoTreeSet(listaTreeSet);

        TreeSet<Integer> resultadoFinal = Stream
                .concat(hashSetFiltrado.stream(), treeSetFiltrado.stream())
                .filter(n -> n % 3 != 0 && n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));

        resultadoFinal.forEach(n ->
                System.out.println("Número en arena: " + n)
        );

        return resultadoFinal;
    }

    public static void main(String[] args) {
        Reto5 reto = new Reto5();
        List<Integer> listaHashSet = List.of(4, 9, 15, 7, 18, 21, 10, 5);
        List<Integer> listaTreeSet = List.of(12, 3, 25, 10, 7, 30, 18, 4);
        TreeSet<Integer> union1 = reto.unirColecciones(listaHashSet, listaTreeSet);
        System.out.println("resultado esperado: " + union1);
    }
}