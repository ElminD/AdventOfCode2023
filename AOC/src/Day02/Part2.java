package Day02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Part2 {

    public static int StackToInt(Stack<Character> stack){
        StringBuilder v = new StringBuilder();
        while(!stack.isEmpty()){
            v.insert(0, stack.pop());
        }
        if(v.length() == 0){
            return 0;
        }
        return Integer.parseInt(v.toString());
    }
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

                Stack<Character> stack = new Stack<Character>();

                for(char c : game.toCharArray()){
                    if(Character.isDigit(c)){
                        stack.push(c);
                    } else {
                        switch(c) {
                            case 'r':
                                red = StackToInt(stack);
                                redMax = Math.max(red, redMax);
                                break;
                            case 'g':
                                green = StackToInt(stack);
                                greenMax = Math.max(green, greenMax);
                                break;
                            case 'b':
                                blue = StackToInt(stack);
                                blueMax = Math.max(blue, blueMax);
                                break;
                            case ':':
                                id = StackToInt(stack);
                                break;
                            default:
                                break;
                        }
                    }
                }   
                gameMap.put(id, redMax + "," + greenMax + "," + blueMax);
            }

            int total = 0;

            for(int i = 1; i < gameMap.size() + 1; i++){

                String[] rgb = gameMap.get(i).split(",");
                int red = Integer.parseInt(rgb[0]);
                int green = Integer.parseInt(rgb[1]);
                int blue = Integer.parseInt(rgb[2]);

                total += (red * green * blue);
            }

            System.out.println("Total: " + total);

            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

    }
}