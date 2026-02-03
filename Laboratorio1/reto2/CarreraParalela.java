import java.util.Arrays;
import java.util.List;

public class CarreraParalela{
	public CarreraParalela(){
		System.out.println("Carrera de buces")
	}
	public int numeroMasGrande(ArrayList<Integer> numeros){
		return numeros.stream().max(Integer::compare).get();
	{
}
