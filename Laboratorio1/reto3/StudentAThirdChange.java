package reto3;
import java.util.stream.IntStream;

public class StudentAThirdChange {
    public String wordRepet(String words){
        StringBuilder sb = new StringBuilder(words);
        IntStream.range(0, 2).forEach(n -> sb.append(" ").append(words));
        return sb.toString();
    }

    public String ecoBuffer(String mensaje) {

            StringBuffer buffer = new StringBuffer(mensaje); 
            buffer.reverse();
            return buffer.toString();
    }

    public String finalReto3(String mensaje){
        String mensajeFinal = wordRepet(mensaje);
        mensajeFinal = ecoBuffer(mensajeFinal);
        return mensajeFinal;
    }

    public static void main(String[] args) {
        StudentAThirdChange obj = new StudentAThirdChange();

        String input = "Hola Mundo";
        String obtenido1 = obj.wordRepet(input);
        System.out.println(obtenido1);
        String obtenido2 = obj.ecoBuffer(input);
        System.out.println(obtenido2);
        String obtenido3  = obj.finalReto3(input);
        System.out.println(obtenido3);

    }

}
