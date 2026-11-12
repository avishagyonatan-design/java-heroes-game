/**
 * avishag yonatan
 * An abstract class representing a general Hero in the game.
 * Implements comparable to define a natural sorting order based on life points.
 */
public abstract class Hero implements Comparable<Hero> {

    protected int lifePoints;
    protected int wins;
    protected int losses;

    /**
     * Constructs a new Hero with the specified initial life points.
     * @param lifePoints the initial life points of the hero.
     */
    public Hero( int lifePoints) {
        this.lifePoints = lifePoints;
        this.wins = 0;
        this.losses = 0;
    }
    /*
    מתודת תקיפה אבסטרקטית כל גיבור מיישם אותה בדרך שלו
     */
    public abstract Hero attack(Hero another);

    /*
    מתודת עזר לחישוב פוטינציאל הנזק
     */
    public abstract double getDamagePotential();

    /**
     * Compares this hero with another hero for natural sorting.
     * Sorting is descending by life points. In case of the tie, Warriors come before Sorcerers.
     * @param other the object to be compared.
     * @return A negative integer as this hero is greater them, equal to, or less them the specified hero.
     */
    @Override
    public int compareTo(Hero other){
        if (this.lifePoints != other.lifePoints){
            return Integer.compare(other.lifePoints, this.lifePoints);
        }
        if (this instanceof Sorcerer &&other instanceof  Sorcerer){
            return -1;
        }
        if (this instanceof Sorcerer && other instanceof Warrior){
            return 1;
        }
        return 0;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
}
