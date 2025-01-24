class Pig implements Animal {
    private String myType;
    private String mySound;

    Pig(){
        myType = "pig";
        mySound = "oink";
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
}
