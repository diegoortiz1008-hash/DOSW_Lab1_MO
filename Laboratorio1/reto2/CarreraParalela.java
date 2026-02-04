import java.util.Arrays;
import java.util.List;

public class CarreraParalela{
	public CarreraParalela(){
		System.out.println("Carrera de buces")
	}
	public int numeroMasGrande(ArrayList<Integer> numeros){
		return numeros.stream().max(Integer::compare).get();
	{
	public int numeroMasPequeño(ArrayList<Integer> numeros){
	       return numero.stream().min(Integer::compare).get();
	}
	
	public list[] resultado(ArrayList<Integer> lista){
		int max = lista.stream().max(Integer::compare).get();
		int min = lista.stream().min(Integer::compare).get();
		long conteo = lista.stream().count();
		return Arrays.asList(max, min, conteo); 
	}
}
