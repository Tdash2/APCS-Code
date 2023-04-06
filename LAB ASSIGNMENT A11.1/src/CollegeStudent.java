public class CollegeStudent extends Student {
    private int year;
    private String major;

    /**
     * Makes a CollegeStudent
     * @param name The person name
     * @param age  The person age
     * @param gender The person gender
     * @param idNum The person id number
     * @param gpa The person gpa
     * @param year The year of school of the person
     * @param major The person major
     */
    public CollegeStudent(String name, int age, String gender, String idNum,
                          double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;
    }

    /**
     * gets the year
     * @return the year
     */

    public int getYear() {
        return this.year;
    }

    /**
     * gets magor
     * @return returns the major
     */
    public String getMajor() {
        return this.major;
    }

    /**
     * sets the year
     * @param set the year you wat to set year to
     */
    public void setYear(int set) {
        this.year = set;
    }
    /**
     * sets the Major
     * @param set the Major you wat to set Major to
     */
    public void setMajor(String set) {
        this.major = set;
    }

    /**
     * returns all the information
     * @return all the info for the person
     */

    public String toString() {
        return super.toString() + ", year: " + year + ", major: "
                + major;
    }
}