package Day02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, String> gameMap = new HashMap<>();

        try {
            File myObj = new File("AOC/src/Day02/input.txt");
            Scanner myReader = new Scanner(myObj);
    
            while (myReader.hasNextLine()) {

                
             
            }

            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

    }
}