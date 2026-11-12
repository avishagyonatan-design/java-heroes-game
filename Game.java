import java.util.ArrayList;

import java.util.ArrayList;

public class Game
{
    public static void main( String args[] )
    {
        ArrayList<Hero> heroes = new ArrayList<Hero>();
        Hero newHero;

        heroes.add( new Warrior( 0, 5 ) );
        heroes.add( new Warrior( 15, 2 ) );
        heroes.add( new Sorcerer( 15, .2 ) );
        printHeroCount();

        int initial = heroes.size();
        for( int i = 0; i < initial; ++i )
        {
            for( int j = i + 1; j < initial; ++j )
            {
                System.out.printf("\ni=%d,j=%d", i,j);
                newHero = heroes.get( i ).attack( heroes.get( j ) );
                if( newHero != null )
                    heroes.add( newHero );
                newHero = heroes.get( j ).attack( heroes.get( i ) );
                if( newHero != null )
                    heroes.add( newHero );
            }
        }
        printHeroCount();

        for( int i = 0; i < heroes.size(); ++i )
        {
            System.out.println( "Hero " + i + " is a " + heroes.get( i ) );
        }

        heroes.get( 0 ).attack( heroes.get( 0 ) );
        System.out.println("        --- Testing Sorting ---");

        System.out.println("\n:Sorting by Life Points (Descending - Natural Order)");
        java.util.Collections.sort(heroes);
        for (Hero h : heroes) {
            System.out.println(h);
        }

        System.out.println("\n:Sorting by Damage Potential (Ascending - Custom Comparator)");
        java.util.Collections.sort(heroes, new DamageComparator());
        for (Hero h : heroes) {
            System.out.println(h);
        }
    }


    static public void printHeroCount()
    {
        System.out.println( "\nThere are " +
                Warrior.getWarriorCount() +
                " warriers and " +
                Sorcerer.getSorcererCount() +
                " sorcerers in the game\n" );
    }

}
