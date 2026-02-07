package reto6;
import java.util.HashMap;
import java.util.Map;

public class Reto6 {

    public static String ejecutarComandoEstudianteA(String comando) {

        switch (comando) {

            case "SALUDAR":
                return "Saludos, viajero del tiempo y del código.";

            case "DESPEDIR":
                return "Que los bits te acompañen, hasta la próxima misión.";

            case "CANTAR":
                return "01010101";

            case "DANZAR":
                return "Girando en modo fiesta.";

            default:
                return "Comando desconocido.";
        }
    }

    public static String ejecutarComandoEstudianteB(String comando) {
        switch (comando.toUpperCase()) {
            case "BROMEAR":
                return "¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio…";
            case "GRITAR":
                return "¡¡¡ALERTA DE STACK OVERFLOW!!!";
            case "SUSURRAR":
                return "Shhh… los bugs están dormidos";
            case "ANALIZAR":
                return "Analizando datos… resultado: ¡Eres increíble programando!";
            default:
                return "Comando no encontrado en el fragmento B";
        }
    }
    private static final Map<String, Runnable> COMANDOS_MAQUINA = new HashMap<>();
    static {

        COMANDOS_MAQUINA.put("SALUDAR", () ->
                System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!"));
        COMANDOS_MAQUINA.put("DESPEDIR", () ->
                System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión."));
        COMANDOS_MAQUINA.put("CANTAR", () ->
                System.out.println("La máquina canta: 01010101"));
        COMANDOS_MAQUINA.put("DANZAR", () ->
                System.out.println("La máquina gira y emite chispas: Girando en modo fiesta."));

        COMANDOS_MAQUINA.put("BROMEAR", () ->
                System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio…"));
        COMANDOS_MAQUINA.put("GRITAR", () ->
                System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!"));
        COMANDOS_MAQUINA.put("SUSURRAR", () ->
                System.out.println("La máquina susurra: Shhh… los bugs están dormidos"));
        COMANDOS_MAQUINA.put("ANALIZAR", () ->
                System.out.println("La máquina procesa: Analizando datos… resultado: ¡Eres increíble programando!"));
    }

    public static void ejecutarComando(String comando) {
        String comandoUpper = comando.toUpperCase();

        if (COMANDOS_MAQUINA.containsKey(comandoUpper)) {
            COMANDOS_MAQUINA.get(comandoUpper).run();
        } else {
            System.out.println("Comando desconocido: '" + comando + "'");
        }
    }

    public static void main(String[] args) {
        //pruebas de funcionalidad
        ejecutarComando("SUSURRAR");
        ejecutarComando("CANTAR");
        ejecutarComando("DESPEDIR");
    }

}
