package mystudent;

public class App {
    public static void main(String[] args) {
        Student myStudent = new Student();

        myStudent.firstName = "John";
        myStudent.lastName = "Doe";
        myStudent.gpa = 3.2;
        myStudent.major = "chemistry";
        myStudent.school = "Fresno State";

        System.out.println("The name of the student is " + myStudent.firstName + " " + myStudent.lastName + " and the school they go to is " + myStudent.school);
        System.out.println("Their major is " + myStudent.major + " " + "and their GPA is " + myStudent.gpa);


    }
}


