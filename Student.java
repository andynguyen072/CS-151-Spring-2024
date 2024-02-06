public class Student {
    int id;
    double gpa;
    String major;

    Student(){
        id = 0;
        gpa = 0.0;
        major = "None";
    }

    Student(String major){
        this.major = major;
    }

    Student(int id, double gpa, String major){
        this.id = id;
        this.gpa = gpa;
        this.major = major;
    }

    double getGPA(){
        return gpa;
    }
}
