class Chick implements Animal {
    private String myType;
    private String mySound;
    private int x = (Math.random() < 0.5) ? 0 : 1;

    /**
     * Sets the chicken's sound base on a random function.
     */
    Chick(){
        myType = "chicken";
        if (x == 0){
            mySound = "cheep";
        }
        else{
            mySound = "cluck";
        }
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