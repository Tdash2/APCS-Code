class Cow implements Animal{
    private String myType;
    private String mySound;

    Cow(){
        myType = "cow";
        mySound = "moo";
    }
    /**
     * Gets the sound the animal makes
     * @return the sound the animal makes
     */
    public String getSound(){
        return mySound;
    }
    /**
     * Gets the type of animal
     * @return the type of animal
     */
    public String getType(){
        return myType;
    }
}