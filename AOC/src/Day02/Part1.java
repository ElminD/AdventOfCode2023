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

                int id = 0;
                int red = 0;
                int redMax = 0;
                int green = 0;
                int greenMax = 0;
                int blue = 0;
                int blueMax = 0;

                String game = myReader.nextLine();
                game += ';';
                for(int i = 0; i < game.length(); i++){
                    if(game.charAt(i) == ':'){
                        id = Character.valueOf(game.charAt(i - 1));
                    }

                    if(game.charAt(i) == ';'){
                        redMax = Math.max(red, redMax);
                        greenMax = Math.max(green, greenMax);
                        blueMax = Math.max(blue, blueMax);
                    }
                    else{
                      if(game.charAt(i) == 'r'){
                          red = Character.valueOf(game.charAt(i - 2));
                      }
                      if(game.charAt(i) == 'g'){
                          green = Character.valueOf(game.charAt(i - 2));
                      }
                      if(game.charAt(i) == 'b'){
                          blue = Character.valueOf(game.charAt(i - 2));
                      }
                    }

                } 

                gameMap.put(id, redMax + "," + greenMax + "," + blueMax);
                System.out.println(id + " " + redMax + "," + greenMax + "," + blueMax);
                
             
            }

            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

    }
}