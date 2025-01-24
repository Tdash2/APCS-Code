import java.util.ArrayList;

public class Farm{
    private ArrayList<Animal> myFarm = new ArrayList <Animal>();

    /**
     * Makes A (farm) where all the Animals are.
     */
    public Farm(){
        myFarm.add(new Cow());
        myFarm.add(new Chick());
        myFarm.add(new Pig());
        myFarm.add(new NamedCow("test"));
    }

    /**
     * Prints out all the sound of the animals in the arraylist.
     */
    public void animalSounds(){
        Animal temp;
        for (int i = 0; i < myFarm.size(); i++){
            temp = myFarm.get(i);
            System.out.println(temp.getType() + " goes " + temp.getSound());
        }
    }
}