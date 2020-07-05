package names;

/**
 * Assignment-3, exercise-5
 *
 * @author Sophia Hjörnhede
 * @version 1.10 30 June 2020
 */

import java.io.*;
import java.util.Scanner;

public class Names {

    public static void main(String[] args) throws IOException {
        runMe();  // Starting program
    }

    public static void runMe() throws IOException {
        // reading name data files into arrays
        String[] arrayBoys = readFromFile("boynames.txt");
        String[] arrayGirls = readFromFile("girlnames.txt");
        // Printing out some examples
        search(arrayGirls, arrayBoys, "Justice");
        search(arrayGirls, arrayBoys, "Walter");
        // Read input from user
        String input = readInputFromUser();
        search(arrayGirls, arrayBoys, input);
    }

    public static String[] readFromFile(String file) throws FileNotFoundException {

        File f = new File(file);
        Scanner scanner = new Scanner(f);
        int elementNumbers = 0;  // variable to check how many elements needed for the array
        while (scanner.hasNext()) { // checking how big array should be
            elementNumbers++;
            scanner.nextLine();
        }
        String[] array = new String[elementNumbers];  // size now known, time to create array
        scanner.close(); // closing scanner for it to reset.
        scanner = new Scanner(f);
        // Filling the array with data
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }
        return array;
    }


    private static String readInputFromUser() throws IOException {
        System.out.print("Enter name to search: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static void search(String[] girls, String[] boys, String pName) {
        String[] splitted;
        boolean found = false;
        // Looking if name is in list
        for (int i = 0; i < girls.length; i++) {
            String s = girls[i];
            splitted = s.split("\\s+");// split at whitespaces
            if (splitted[0].equals(pName)) {
                System.out.println(
                        pName + " is ranked " + (i + 1) + " in popularity among girls with "
                                + splitted[1] + " namings."
                );
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println(pName + " is not ranked among the top 1000 girl name.");

        found = false;  // Need to reset for checking boys array.
        for (int i = 0; i < boys.length; i++) {
            String s = boys[i];
            splitted = s.split("\\s+");// split at whitespaces
            if (splitted[0].equals(pName)) {
                System.out.println(
                        pName + " is ranked " + (i + 1) + " in popularity among boys with "
                                + splitted[1] + " namings."
                );
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println(pName + " is not ranked among the top 1000 boy name.");
    }
}

