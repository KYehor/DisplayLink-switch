package ua.in.spilnasprava;

/**
 * Class that show to us animal behaviors.
 * @author Yehor Kachur
 * @version 1.0
 *
 */

public class Main {
    public static void main(String args[]) {
        /**
         *
         * @param move  for Cats and Dogs
         * @param voice for Cats and Dogs
         * @param name  for Cats and Dogs
         */
        Animals a = new Animals(); // Animals reference but Dogs object
        a.habits();                // runs the method in Animals class
        a.voice();                 // runs the method in Animals class
        Animals b = new Dogs();    // Animals reference but Dogs object
        b.name();                  // runs the method 1in Dogs class
        b.voice();                 // runs the method in Dogs class
        b.habits();                // runs the method in Dogs class
        Animals c = new Cats();    // Animals reference but Dogs object
        c.name();                  // runs the method in Cats class
        c.voice();                 // runs the method in Cats class
        c.habits();                // runs the method in Cats class
    }
}
