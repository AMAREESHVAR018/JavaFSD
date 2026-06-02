class Ex29_EnrollmentRecordDemo {
    record Enrollment(String studentName, String courseName) {
    }

    public static void main(String[] args) {
        Enrollment enrollment = new Enrollment("Aarav", "Java Basics");
        System.out.println(enrollment);
    }
}

