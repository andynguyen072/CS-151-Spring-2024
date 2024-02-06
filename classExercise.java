import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class classExercise {
    static double CalculateSum(int theInteger, float theFloat, double ... theDoubles){
        double sum = 0;

        for(double number: theDoubles){
            sum += number;
        }

        System.out.println("The sum is: " + sum);
        return sum;
    }

    static double CalculateSum(int theInteger, double ... theDoubles){
        double sum = 0;

        for(double number: theDoubles){
            sum += number;
        }

        System.out.println("The sum is: " + sum);
        return sum;
    }

    public static void main(String[] args){
        // Exercise 1

        Student student1 = new Student();
        System.out.println(student1.major);
        student1.major = "Computer Science";
        System.out.println(student1.major);

        // Exercise 2
        CalculateSum(0, 1, 2, 3);
        CalculateSum(0, 1.0, 2, 3);
    }
}