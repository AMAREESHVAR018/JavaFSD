class Ex18_Student extends Ex18_Person {
    String course;

    Ex18_Student(String name, String course) {
        super(name);
        this.course = course;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Ex18_Student student = new Ex18_Student("Riya", "Java Fundamentals");
        student.display();
    }
}


