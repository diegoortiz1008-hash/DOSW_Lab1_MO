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

    public static TreeSet<Integer> unirColecciones(Set<Integer> hashSetA, Set<Integer> treeSetB) {
        TreeSet<Integer> resultadoFinal = Stream
                .concat(hashSetA.stream(), treeSetB.stream())
                .filter(n -> n % 3 != 0 && n % 5 != 0)
                .distinct()
                .collect(Collectors.toCollection(TreeSet::new));

        resultadoFinal.forEach(n ->
                System.out.println("Número en arena: " + n)
        );

        return resultadoFinal;
    }
}