package dices;

/**
 * Assignment-3, exercise-1
 *
 * @author Sophia Hjörnhede
 * @version 1.10 06 July 2020
 */

import java.util.HashMap;

public class Dices {
    private int dieA;
    private int dieB;

    public static void main(String[] args) {
        // Making 10000 dice rolls
        rollTheDices(10000);
    }

    public static void rollTheDices(int rolls) {
        // hashmap to store dice rolls
        HashMap<Integer, Integer> whatsTheFrequency = new HashMap<Integer, Integer>();
        int dieA;
        int dieB;

        // loop for simulate dice rolls
        for (int i = 0; i < rolls; i++) {
            // Making dice rolls with Math.random
            dieA = (int) (Math.random() * 6 + 1);
            dieB = (int) (Math.random() * 6 + 1);

            // Checking if sum of rolls is in hashmap, if not then give it value 1
            if(whatsTheFrequency.get(dieA + dieB) == null)
                whatsTheFrequency.put(dieA+dieB,1);
            else // if sum of rolls is found in hashmap then just add +1
            {
                int tmp= whatsTheFrequency.get(dieA+dieB);
                whatsTheFrequency.put(dieA+dieB, tmp=tmp+1);
            }
        }
        String format = "%-7s %5d\n";  // Formatting string
        System.out.println("Frequency table (sum, count) for rolling two dices "+ rolls+ " times is:");
        whatsTheFrequency.entrySet().forEach(entry->{
            System.out.format(format, entry.getKey() , entry.getValue());
        });
    }
}