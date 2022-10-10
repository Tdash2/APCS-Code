 class PiggyBank {
    int my_Pennies;
    int my_Nickels;
    int my_Dimes;
    int my_Quarters;

    /**
     * Set the initial value of the bank
     * @param pennies Number of pennies
     * @param nickels Number of nickels
     * @param dimes Number of dimes
     * @param quarters Number of quarters
     */
    public PiggyBank(){
        my_Dimes = 0;
        my_Nickels = 0;
        my_Pennies = 0;
        my_Quarters = 0;
    }
     /**
      * Set the initial value of the bank
      * @param pennies Number of pennies
      * @param nickels Number of nickels
      * @param dimes Number of dimes
      * @param quarters Number of quarters
      */
    public PiggyBank(int pennies, int nickels, int dimes, int quarters){
        my_Dimes += dimes;
        my_Nickels += nickels;
        my_Pennies += pennies;
        my_Quarters += quarters;
    }
     /**
      * Adds funds to the bank
      * @param pennies Number of pennies
      * @param nickels Number of nickels
      * @param dimes Number of dimes
      * @param quarters Number of quarters
      */
    public void addFunds(int pennies, int nickels, int dimes, int quarters){
        my_Dimes += dimes;
        my_Nickels += nickels;
        my_Pennies += pennies;
        my_Quarters += quarters;
    }

     /**
      *
      * @return How many Pennies are in the bank
      */
    public int getPennies(){
        return my_Pennies;
    }
     /**
      *
      * @return How many Nickels are in the bank
      */
    public int getNickels(){
        return my_Nickels;
    }
    /**
      *
      * @return How many Dimes are in the bank
      */
    public int getDimes(){
        return my_Dimes;
    }
     /**
      *
      * @return How many Quarters are in the bank
      */
    public int getQuarters() {
        return my_Quarters;
    }
     /**
      *
      * @return The total balance in the bank in dollars
      */
    public double getBalance(){
        return (my_Pennies + (my_Nickels * 5) + (my_Dimes * 10) + (my_Quarters *25)) /100;
     }
}
