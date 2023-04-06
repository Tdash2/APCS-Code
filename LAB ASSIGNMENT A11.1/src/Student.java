public class Student extends Person {
    private String myIdNum;
    private double myGPA;

    /**
     * Make a student
     * @param name The students name
     * @param age The students age
     * @param gender The students gender
     * @param idNum The students ID number
     * @param gpa The students gpa
     */

    public Student(String name, int age, String gender, String idNum, double gpa) {
        // use the super class' constructor
        super(name, age, gender);

        // initialize what's new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }

    /**
     * Gets the students ID number
     * @return the students ID number
     */
    public String getIdNum() {
        return myIdNum;
    }
    /**
     * Gets the students gpa
     * @return the students gpa
     */
    public double getGPA() {
        return myGPA;
    }

    /**
     * sets the students id number
     * @param idNum the id number you want to set it to
     */
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    /**
     * sets the students gpa
     * @param gpa the id number you want to set it to
     */
    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    /**
     * Prints out all the students info
     * @return the students info
     */
    public String toString() {
        return super.toString() + ", student id: " + myIdNum + ", gpa: "
                + myGPA;
    }
}