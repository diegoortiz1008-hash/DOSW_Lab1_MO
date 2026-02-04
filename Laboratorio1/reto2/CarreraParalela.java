import java.util.ArrayList;
import java.util.List;

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

    	int max = numeroMasGrande(buses);
    	int min = numeroMasPequeño(buses);
    	int size = buses.size();

    	return List.of(
            	max,
            	min,
            	size,
            	(max % 2 == 0) ? 1 : 0,
            	(size % 2 == 0) ? 1 : 0
    	);
	}

	public List<Object> resultadoSeparado(List<Integer> firstList, List<Integer> secondList) {
    	List<Object> resultado = new ArrayList<>();
    
    	resultado.add("Lista 1");
    	resultado.addAll(resultado(firstList));
    
    	resultado.add("Lista 2");
    	resultado.addAll(resultado(secondList));
    
    	return resultado;
	}
}
