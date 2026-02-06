public class Reto6 {

    public static String ejecutarComando(String comando) {

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
}
