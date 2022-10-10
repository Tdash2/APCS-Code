public class Car {
    int myStartMiles;
    int myEndMiles;
    double myGallonsUsed;
    public Car(int miles){
    myStartMiles = miles;
        myEndMiles = miles;
    }
    public void fillUp (int odometerReading, double gallons)
    {
    myEndMiles = odometerReading;
    myGallonsUsed += gallons;
    }
    double calculateMPG(){

        return (myEndMiles - myStartMiles)/ myGallonsUsed;
    }
    void resetMPG () {
        myStartMiles = myEndMiles;
        myGallonsUsed = 0;
    }
    double getEndMiles(){
        return myEndMiles;
    }
}
