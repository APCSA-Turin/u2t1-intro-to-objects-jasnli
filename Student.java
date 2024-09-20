public class Student {
    // variables for the class
    String firstName;
    String lastName;
    double grade;
    int studentID;

    public Student(String nameL, String nameF, double grd, int SID) {
        firstName = nameF;
        lastName = nameL;
        grade = grd;
        studentID = SID;
    }

    public void studentStatus() {
        System.out.println("STUDENT NAME: " + firstName + " " + lastName);
        System.out.println("STUDENT ID: " + studentID);
        System.out.println("STUDENT GRADE: " + grade);

        if (grade >= 65) {
            if (grade >= 85) {
                System.out.println("Student is excelling!");
            }
            if (grade < 85) {
                System.out.println("Student is passing!");
            }
        } else {
            System.out.println("Student is failing!");
        }
        
    }

}
