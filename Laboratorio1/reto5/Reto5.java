import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Reto5 {

    public Set<Integer> metodoHashSet(List<Integer> numeros) {

        return numeros.stream()
                .filter(n -> n % 3 != 0)         
                .collect(Collectors.toCollection(HashSet::new));
    }

    public static TreeSet<Integer> unirColecciones(Set<Integer> hashSetA,Set<Integer> treeSetB) {
        TreeSet<Integer> resultadoFinal = Stream
                .concat(hashSetA.stream(), treeSetB.stream())
                .collect(TreeSet::new, TreeSet::add, TreeSet::addAll);

        resultadoFinal.forEach(n ->
                System.out.println("Número en arena: " + n)
        );

        return resultadoFinal;
    }
}