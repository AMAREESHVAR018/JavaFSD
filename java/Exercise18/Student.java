public class Student extends Person {
    String course;

    Student(String name, String course) {
        super(name);
        this.course = course;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Student student = new Student("Riya", "Java Fundamentals");
        student.display();
    }
}