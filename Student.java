public class Student extends Person {
    private String faculty;
    private String num_matrix;

    public Student(String name, String surname, int age, String faculty, String num_matrix) {
        super(name, surname, age);
        this.faculty = faculty;
        this.num_matrix = num_matrix;
    }

    public Student() {
        super(" ", " ", 0);
        this.faculty = " ";
        this.num_matrix = " ";
    }

    public void display() {
        super.display();
        System.out.println("Faculty : [ " + faculty + " ]");
        System.out.println("Number of Matrix : [ " + num_matrix + " ]");
    }

    public String getFaculty() {
        return faculty;
    }

    public String getNumMatrix() {
        return num_matrix;
    }

}
