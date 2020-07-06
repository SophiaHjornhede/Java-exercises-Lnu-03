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
        rollTheDices(10000);
    }

    public static void rollTheDices(int rolls) {
        HashMap<Integer, Integer> whatsTheFrequency = new HashMap<Integer, Integer>();
        int dieA;
        int dieB;

        for (int i = 0; i < rolls; i++) {
            dieA = (int) (Math.random() * 6 + 1);
            dieB = (int) (Math.random() * 6 + 1);

            if(whatsTheFrequency.get(dieA + dieB) == null)
                whatsTheFrequency.put(dieA+dieB,1);
            else
            {
                int tmp= whatsTheFrequency.get(dieA+dieB);
                whatsTheFrequency.put(dieA+dieB, tmp=tmp+1);
            }
        }
        String format = "%-7s %5d\n";
        System.out.println("Frequency table (sum, count) for rolling two dices "+ rolls+ " times is:");
        whatsTheFrequency.entrySet().forEach(entry->{
            System.out.format(format, entry.getKey() , entry.getValue());
        });
    }
}