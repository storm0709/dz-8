import java.util.LinkedList;
import java.util.List;

public class Group {
    private Student groupLeader;
    private List <Student> students;
    private List <String> tasks;

    public Group (Student groupLeader){
        if(groupLeader==null){
            groupLeader=new Student(null,null);
        }
        this.groupLeader=groupLeader;
        this.students=new LinkedList<>();
        this.tasks=new LinkedList<>();
    }

    public Student getGroupLeader(){
        return groupLeader;
    }

    public void setGroupLeader(Student groupLeader){
        if(groupLeader==null){
            groupLeader=new Student(null,null);
        }
        this.groupLeader=groupLeader;
    }

    public List<Student> getStudents(){
        return students;
    }
    public void addStudent (Student idStudent){
        students.add(idStudent);
    }
    public void deleteStudent (Student idStudent){
        students.remove(idStudent);
    }
    public void renameStudent (Student idStudent, String name, String surname){
        idStudent.setName(name);
        idStudent.setSurname(surname);
    }
    public List<String> getTasks(){
        return tasks;
    }

    public void addTask(String task){
        tasks.add(task);
    }
}
