/**
 * Represents a Sorcerer hero that attacks using a magic ratio.
 */
public class Sorcerer extends Hero{

    private double magicRatio;
    private static int sorcererCount = 0;

    /**
     * Constructs a new Sorcerer.
     * @param lifePoints The initial life points of the sorcerer.
     * @param magicRatio The magic ratio used for calculating damage.
     */
    public Sorcerer(int lifePoints, double magicRatio) {
        super(lifePoints);
        this.magicRatio = magicRatio;
        sorcererCount++;
    }
    /**
     * Gets the total number of Sorcerer objects created.
     * @return The count of sorcerers.
     */
    public static int getSorcererCount(){
        return sorcererCount;
    }

    /**
     *  Attacks another hero by multiplying the target's life points by the magic ratio.
     * @param another The hero being attacked.
     * @return A new cloned Sorcerer if the target's life points fall below this sorcerer's life points multiplied by the ratio, null otherwise.
     */
    @Override
    public Hero attack(Hero another){
        if (this == another){
            System.out.println("A sorcerer mey not attack itself");
            return null;
        }
        another.lifePoints = (int) (another.lifePoints * this.magicRatio);
        if (another.lifePoints < (this.lifePoints * this.magicRatio)){
            this.wins++;
            another.losses++;
            return new Sorcerer(this.lifePoints, this.magicRatio);
        }
        return null;
    }

    /**
     * Gets the maximum damage potential of the sorcerer.
     * @return he magic ratio multiplied by 100.
     */
    @Override
    public double getDamagePotential(){
        return this.magicRatio * 100.0;
    }

    /**
     * Returns a string representation of the Sorcerer.
     * @return A string containing the sorcerer's stats.
     */
    @Override
    public String toString(){
        return "Sorcerer: " + lifePoints + " life points, " + magicRatio + " magic ratio. [Wins: " + wins + ", Losses: " + losses + "]";
    }


}
