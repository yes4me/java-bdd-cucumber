package others.basic_knowledge;

import java.util.Arrays;

/**
 * Created by Thomas on 12/21/2016.
 */
public class IntRandom {
    // Return a random number between 0 and maxNumber
    public static int randomInt(int maxNumber) {
        return (int) (Math.random()*(maxNumber+1));
    }

    public static void main(String[] args) {
        for (int i=0; i<10; i++)
        System.out.println("Random number: " + randomInt(3));
    }
}
