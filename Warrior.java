/**
 * Represents a Warrior hero that attack using specific attack points.
 */
public class Warrior extends Hero{

    private int attackPoints;
    private static int warriorCounter = 0;

    /**
     * Constructs a new Warrior.
     * @param lifePoints The initial life points of the warrior.
     * @param attackPoints The number of attack points the warrior has.
     */
    public Warrior(int lifePoints, int attackPoints) {
        super(lifePoints);
        this.attackPoints = attackPoints;
        warriorCounter++;
    }

    /**
     * Gets the total number of warrior object created.
     * @return The count of warrior.
     */
    public static int getWarriorCount(){
        return warriorCounter;
    }

    /**
     * Attack another hero by subtracting the warrior's attack points from the target's life points.
     * @param another The hero being attacked.
     * @return A new cloned Warrior if the target's life points fall below half of this warrior's current life points, null otherwise.
     */
    @Override
    public Hero attack(Hero another) {
        if (this == another){
            System.out.println("A warrior may not attack itself");
            return null;
        }
        another.lifePoints -= this.attackPoints;
        if (another.lifePoints < (this.lifePoints / 2.0)){
            this.wins++;
            another.losses++;
            return new Warrior(this.lifePoints, this.attackPoints);
        }
        return null;
    }

    /**
     *  Gets the damage potential of the warrior.
     * @return  The attack points of the warrior.
     */
    @Override
    public double getDamagePotential(){
        return this.attackPoints;
    }

    /**
     * Returns a string representation of the Warrior.
     * @return A string containing the warrior's stats.
     */
    @Override
    public String toString(){
        return "Warrior: " + lifePoints + " life points, " + attackPoints + " attack points. [Wins: " + wins + ", Losses: " + losses + "]";
    }
}
