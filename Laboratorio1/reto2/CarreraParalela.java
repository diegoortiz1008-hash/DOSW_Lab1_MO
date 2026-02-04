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
                buses.size()
        ).toList();
    }
}
