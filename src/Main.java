
public class Main {
    public static void main(String[] args) {
        // Create some sample students
        Student alice = new Student("Alice", "Smith");
        Student bob = new Student("Bob", "Jones");
        Student charlie = new Student("Charlie", "Brown");

        // Create a group with Alice as the leader and add Bob and Charlie as members
        Group group = new Group(alice);
        group.addStudent(bob);
        group.addStudent(charlie);

        // Print out the group leader's name
        System.out.println("Group Leader: " + group.getGroupLeader().getName() + " " + group.getGroupLeader().getSurname());

        // Change the group leader to Bob
        group.setGroupLeader(bob);

        // Print out the group leader's name again
        System.out.println("Group Leader: " + group.getGroupLeader().getName() + " " + group.getGroupLeader().getSurname());

        // Add a task for the group
        group.addTask("Learn encapsulation");
        group.addTask("Create encapsulated program");

        // Print out the task list
        System.out.println("Task List: " + group.getTasks());

        // Rename Alice to Alice A. Smith
        group.renameStudent(alice, "Alice A.", "Smith");

        // Print out the updated student list
        System.out.println("Student List: " + group.getStudents().get(0).getName() + " " + group.getStudents().get(0).getSurname() + ", "
                + group.getStudents().get(1).getName() + " " + group.getStudents().get(1).getSurname());
    }
}