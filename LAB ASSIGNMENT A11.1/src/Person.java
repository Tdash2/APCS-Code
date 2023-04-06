public class Person {
    private String myName;
    private int myAge;
    private String myGender;

    /**
     * Makes a person
     * @param name the persons name
     * @param age the persons age
     * @param gender the persons gender
     */
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    /**
     * Gets the name of the Person
     * @return the name of the Person
     */
    public String getName() {
        return myName;
    }
    /**
     * Gets the age of the Person
     * @return the age of the Person
     */

    public int getAge() {
        return myAge;
    }
    /**
     * Gets the gender of the Person
     * @return the gender of the Person
     */
    public String getGender() {
        return myGender;
    }

    /**
     * Sets the name of the person
     * @param name the name of the person
     */
    public void setName(String name) {
        myName = name;
    }
    /**
     * Sets the age of the person
     * @param age the age of the person
     */
    public void setAge(int age) {
        myAge = age;
    }

    /**
     * Sets the gender of the person
     * @param gender the gender of the person
     */
    public void setGender(String gender) {
        myGender = gender;
    }

    /**
     * Reterns all info about the person
     * @return All the person's info
     */
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}