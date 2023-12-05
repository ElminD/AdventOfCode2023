package Day03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) throws Exception {
         char[][] engine = new char[140][140];
        try {
            File myObj = new File("AOC/src/Day03/input.txt");
            Scanner myReader = new Scanner(myObj);

            for(int row = 0; myReader.hasNextLine() && row < 140; row++) {
                engine[row] = myReader.nextLine().toCharArray();
            }
            
            for(int row = 0; row < 140; row++) {
                for(int col = 0; col < 140; col++) {

                    if(engine[row][col] == 'L') {
                        engine[row][col] = '#';
                    }

                    System.out.print(engine[row][col]);
                }
                System.out.println();
            }
    
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
  }
}
