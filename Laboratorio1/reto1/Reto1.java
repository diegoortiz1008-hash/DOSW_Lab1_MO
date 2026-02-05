import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Reto1 {

    private WelcomeMessage message;
    private List<Student> students;

    public static void main(String[] args) {

        WelcomeMessage welcome = new WelcomeMessage("¡Hola, bienvenidos!");

        List<Student> students = Arrays.asList(
            new Student("Juan Pérez", "juan.perez@mail.escuelaing.edu.co", 21, 6),
            new Student("Miguel Roncancio", "miguel.roncancio@mail.escuelaing.edu.co", 22, 5)
        );

        // Programación funcional
        String studentInfo = students.stream()
            .map(s -> "Nosotros somos la pareja conformada por "
                    + s.getName()
                    + ", estudiante de " + s.getSemester() + "° semestre de "
                    + s.getAge() + " años")
            .collect(Collectors.joining(", y "));

        String emails = students.stream()
            .map(Student::getEmail)
            .collect(Collectors.joining(" y "));

        System.out.println(
            welcome.getMessage() + " " +
            studentInfo +
            ". Nuestros correos institucionales son " +
            emails + "."
        );
    }
}
