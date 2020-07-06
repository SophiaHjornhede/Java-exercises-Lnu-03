package numbers;

/**
 * Assignment-3, exercise-4
 *
 * @author Sophia Hjörnhede
 * @version 1.10 06 July 2020
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) throws FileNotFoundException {

        DecimalFormat twoDec = new DecimalFormat("#.##");
        // Array to store data from file
        int[] testArray = readData("numbers.txt");
        System.out.println("Average: " +  twoDec.format(average(testArray)));
        standardDeviation(testArray);    }

    // Method to read data from file into an array of integers
    public static int[] readData(String file) throws FileNotFoundException {
        File f = new File(file);
        Scanner scanner = new Scanner(f);
        int elementNumbers = 0;  // variable to check how many elements needed for the array
        while (scanner.hasNext()) { // checking how big array should be
            elementNumbers++;
            scanner.nextInt();
        }
        int[] array = new int[elementNumbers];  // size now known, time to create array
        scanner.close(); // closing scanner for it to reset.
        scanner = new Scanner(f);
        // Filling the array with data
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // Simple method to calculate the average in an array of int
    public static double average(int[] array) {

        double average = 0;
        for (int value : array) {
            average += value;
        }
        return  average / array.length;
    }

    // Main method to calculate std deviation from an array of integers
    public static void standardDeviation(int[] pArray) {
        // setting decimal format
        DecimalFormat twoDec = new DecimalFormat("#.##");

        double[] diffrences = new double[pArray.length];
        double averageD = average(pArray);

        // diff from avg.
        for (int i = 0; i < pArray.length; i++) {
            diffrences[i] = pArray[i] - averageD;
        }

        // square elements
        for (int i = 0; i < diffrences.length; i++) {
            diffrences[i] = diffrences[i] * diffrences[i];
        }

        // sum of sqr elements
        double sumOfElements = 0;
        for (double diffrence : diffrences) {
            sumOfElements += diffrence;
        }

        double intermediateStep = sumOfElements / (pArray.length - 1);
        // Square root the result
        double result = Math.sqrt(intermediateStep);  //
        // printing out result with two decimals
        System.out.println("Standard Deviation " + twoDec.format(result));
        // System.out.println("Standard Deviation v2 " + twoDec.format(result));
    }
}