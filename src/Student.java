public class Student {
    private static int idBase = 0;
    private int idStudent;
    private String name;
    private String surname;

    public Student (String name, String surname) {
        idBase++;
        this.idStudent=idBase;
        this.name=name;
        this.surname=surname;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
