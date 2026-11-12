import java.util.Comparator;

/**
 * A custom comparator used to sort heroes based on their damage potential in ascending order.
 */
public class DamageComparator implements Comparator<Hero> {
    /**
     *  Compares two heroes by their damage potential.
     * @param h1 the first object to be compared.
     * @param h2 the second object to be compared.
     * @return  A negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
     */
    @Override
    public int compare(Hero h1, Hero h2){
        return Double.compare(h1.getDamagePotential(), h2.getDamagePotential());
    }
}
