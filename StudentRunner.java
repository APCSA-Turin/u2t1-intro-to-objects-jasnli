public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("LI", "JASON", 98.83, 2094);
        student1.studentStatus();

        System.out.println("----------");

        Student student2 = new Student("CHU", "ANDREW", 64.99, 2093);
        student2.studentStatus();

        System.out.println("----------");

        Student student3 = new Student("SOEWIGNJO", "CHERINE", 80, 2092);
        student3.studentStatus();
        
        System.out.println("----------");
    }
}