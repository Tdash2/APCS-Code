class NamedCow extends Cow {
    private String myType;
    private String mySound;
    private String myName;

    NamedCow(String name) {
        myType = "cow";
        mySound = "moo";
        myName = name;
    }
    /**
     * Gets the sound the animal makes
     * @return the sound the animal makes
     */
    public String getSound() {
        return mySound;
    }
    /**
     * Gets the type of animal
     * @return the type of animal
     */
    public String getType() {
        return myType;
    }
    /**
     * Gets the name of animal
     * @return the name of animal
     */
    public String getName() {
        return myName;
    }
}