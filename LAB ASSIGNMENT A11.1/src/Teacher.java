public class Teacher extends Person {
    private String subject;
    private double salary;

    /**
     * Makes a teacher
     * @param name the teachers name
     * @param age the teachers age
     * @param gender the teachers gender
     * @param subject the subjects the teacher teaches
     * @param salary the teachers salary
     */
    public Teacher(String name, int age, String gender, String subject,	double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    /**
     * gets the teachers Subject
     * @return the teachers Subject
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * Gets the teacher's Salary
     * @return teacher's Salary
     */
    public double getSalary() {
        return this.salary;
    }

    /**
     * sets the teachers Subject
     * @param set the Subject you want to set
     */
    public void setSubject(String set) {
        this.subject = set;
    }

    /**
     * sets the teacher Salary
     * @param set the Salary the person should get
     */
    public void setSalary(double set) {
        this.salary = set;
    }

    /**
     * Returns all the teachers info
     * @return  all the teachers info
     */
    public String toString() {
        return super.toString() + ", subject: " + subject + ", salary: "
                + salary;
    }
}