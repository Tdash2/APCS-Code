import java.util.*;
public class GameLand {
    Random rand;
    private int playerA = 0;
    private int playerB = 0;
    private int die1;
    private int die2;
    private int diceRoll;
    private int turn;
    /**
     * create a new Random object and
     * initialize with the give seed
     * @param seed - seed for the random number generator
     */
    public GameLand(int seed)
    {
        rand = new Random(seed);
    }
    /**
     * Roll two dice
     */
    public void roll()
    {
        die1 = rand.nextInt(6) + 1;
        die2 = rand.nextInt(6) + 1;
        diceRoll = die1 + die2;

    }
    /**
     * Runs the game. On each move print the roll and the players location after the move.
     */
    public void moving()
    {
        playerA = 0;
        playerB = 0;

        while ((playerA < 100) && (playerB < 100)) {
            turn = 1;
            if (playerA >= 0) {
                this.roll();
                if (diceRoll == 2 || diceRoll == 12) {
                    turn++;
                    System.out.println("Player A rolled a " + diceRoll + " >>> " +  "** Player A is now at " + playerA);
                }else{
                    if(diceRoll == 7) {
                        playerA = playerA - 7;
                        if(playerA <= 0) {
                            playerA = 0;
                            turn++;
                        }
                        System.out.println("Player A rolled a " + diceRoll + " >>> " +  " ******* Player A is now at " + playerA);
                    } else {

                        if ((playerA + diceRoll) >= 100) {
                            playerA += diceRoll;
                            playerB = playerB + 0;
                            System.out.println("Player A rolled a " + diceRoll + " >>> " +  "Player A WINS!!");
                            turn++;

                        } else {
                            if ((playerA + diceRoll) == playerB) {
                                playerB = 0;
                                playerA += diceRoll;
                                turn++;
                                System.out.println("Player A rolled a " + diceRoll + " >>> " +  "- BUMPED - Player A is now at " + playerA);
                            } else {
                                if (diceRoll != 2 && diceRoll != 7 && diceRoll != 12) {
                                    playerA += diceRoll;
                                    System.out.println("Player A rolled a " + diceRoll + " >>> " +  "Player A is now at " + playerA);
                                    turn++;
                                }
                            }
                        }
                    }
                }
            }
            if ((playerB >= 0) && (playerA < 100)) {
                this.roll();
                if (diceRoll == 2 || diceRoll == 12) {
                    turn++;
                    System.out.println("Player B rolled a " + diceRoll + " >>> " +  "** Player B is now at " + playerB);
                }else{
                    if(diceRoll == 7) {
                        playerB = playerB - 7;
                        if(playerB <= 0) {
                            playerB = 0;
                            turn++;
                        }
                        System.out.println("Player B rolled a " + diceRoll + " >>> " +  " ******* Player B is now at " + playerB);
                    } else {
                        if ((playerB + diceRoll) >= 100) {
                            System.out.println("Player B rolled a " + diceRoll + " >>> " +  "Player B WINS!!");
                            playerB += diceRoll;
                            turn++;
                        } else {
                            if ((playerB + diceRoll) == playerA) {
                                playerA = 0;
                                playerB += diceRoll;
                                turn++;
                                System.out.println("Player B rolled a " + diceRoll + " >>> " +  "- BUMPED - Player B is now at " + playerB);
                            } else {
                                if (diceRoll != 2 && diceRoll != 7 && diceRoll != 12) {
                                    playerB += diceRoll;
                                    System.out.println("Player B rolled a " + diceRoll + " >>> " +  "Player B is now at " + playerB);
                                    turn++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Player A is now at " + playerA);
        System.out.println("Player B is now at " + playerB);
    }
}
