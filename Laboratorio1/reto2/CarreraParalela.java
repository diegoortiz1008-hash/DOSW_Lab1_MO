import java.util.List;
import java.util.stream.Stream;

public class CarreraParalela{
	public CarreraParalela(){
		System.out.println("Carrera de buces");
	}
	public int numeroMasGrande(List<Integer> numeros){
		return numeros.stream().max(Integer::compare).get();
	}
	public int numeroMasPequeño(List<Integer> numeros){
	       return numeros.stream().min(Integer::compare).get();
	}

    public List<Integer> resultado(List<Integer> buses) {

        return Stream.of(
                numeroMasGrande(buses),
                numeroMasPequeño(buses),
                buses.size(),
				// 1 si el numero mas grande es par, 0 si es impar
				(numeroMasGrande(buses) % 2 == 0) ? 1 : 0,
				// 1 si el numero de datos es par, 0 si es impar
				(buses.size() % 2 == 0) ? 1 : 0
        ).toList();
    }

	public List<Integer> resultado(List<Integer> firstList, List<Integer> secondList) {
		return Stream.of(
				//El toList solo esta dejando meter enteros pana
				numeroMasGrande(firstList),
				numeroMasPequeño(firstList),
				firstList.size(),
				(numeroMasGrande(firstList) % 2 == 0) ? 1 : 0,
				(firstList.size() % 2 == 0) ? 1 : 0,
				-2, //el dos funciona como separador en este caso
				numeroMasGrande(secondList),
				numeroMasPequeño(secondList),
				secondList.size(),
				(numeroMasGrande(secondList) % 2 == 0) ? 1 : 0,
				(secondList.size() % 2 == 0) ? 1 : 0
		).toList();
	}

}
