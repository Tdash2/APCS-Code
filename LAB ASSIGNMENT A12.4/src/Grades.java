import java.util.*;

public class Grades {
    private String grade;
    private int count;
    private double total;
    private int hasF;
    private double gpa;

    /**
     * Asks a user for there grads and stores them.
     */
    public void getGradesAndCalculateGPA()
    {
        Scanner sc = new Scanner(System.in);
        grade = "a";
        count = -1;
        total = 0;
        hasF = 0;

        while (grade.indexOf("a") >= 0 || grade.indexOf("b") >= 0 || grade.indexOf("c") >= 0 ||
                grade.indexOf("d") >= 0 || grade.indexOf("f") >= 0){
            System.out.print("Enter your grades: ");
            grade = sc.next();
            grade = grade.toLowerCase();
            if (grade.indexOf("a") >= 0){
                total = total + 4.0;
            }
            else if (grade.indexOf("b") >= 0){
                total = total + 3.0;
            }
            else if (grade.indexOf("c") >= 0){
                total = total + 2.0;
            }
            else if (grade.indexOf("d") >= 0){
                total = total + 1.0;
            }
            else if (grade.indexOf("f") >= 0){
                total = total + 0;
                hasF++;
            }
            else{
                grade = "no";
            }
            count++;
        }
    }

    /**
     * Prints out the Ineligibility of a user
     */
    public void printMessage()
    {
        gpa = total / count;
        System.out.print("GPA = ");
        System.out.printf("%.2f", gpa);
        System.out.println();

        if (count < 4){
            System.out.println("Ineligible, taking less than 4 classes");
        }
        else if (gpa > 2.0 && hasF > 0){
            System.out.println("Ineligible, gpa above 2.0 but has F grade");
        }
        else if (gpa < 2.0  && hasF > 0){
            System.out.println("Ineligible, gpa below 2.0 and has F grade");
        }
        else if (gpa < 2.0){
            System.out.println("Ineligible, gpa below 2.0");
        }
        else{
            System.out.println("Eligible");
        }
    }
}