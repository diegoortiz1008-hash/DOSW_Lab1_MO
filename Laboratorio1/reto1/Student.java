public class Student{

    private String name;
    private int age;
    private String email;
    private int semester;

    public Student(String newName, String newEmail, int newAge, int newSemester){
        age = newAge;
        email = newEmail;
        name = newName;
        semester = newSemester;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public int getSemester() {
        return semester;
    }
}