public class Student {
    private String name;
    private int id;
    private int age;
    private double gpa;

    // Constructor
    public Student(String name, int id, int age, double gpa) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gpa = gpa;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    public static void main(String[] args) {
        Student student = new Student("John Doe", 12345, 20, 3.8);
        student.displayStudentInfo();
    }
}
