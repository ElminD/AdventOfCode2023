package Day03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Part1 {

    public void main(String[] args) throws Exception {
        char[][] engine = new char[140][140];
        try {
            File myObj = new File("AOC/src/Day03/input.txt");
            Scanner myReader = new Scanner(myObj);

            for(int row = 0; myReader.hasNextLine() && row < 140; row++) {
                engine[row] = myReader.nextLine().toCharArray();
            }

            int count = 0;
            
            for(int row = 0; row < 140; row++) {
                for(int col = 0; col < 140; col++) {
                    if((engine[row][col] != '.') && (!Character.isDigit(engine[row][col]))) {                 
                        count += addNumbers(engine, row, col);
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

    int addNumbers(char[][] engine, int row, int col){
        int ogRow = row;
        int ogCol = col;
        int total = 0;


        //top left
        if(Character.isDigit(engine[row - 1][col - 1])) {
            while(Character.isDigit(engine[row][col - 1])) {
                col--;
            }

            while(Character.isDigit(engine[row][col])) {
                total += engine[row][col];
                col++;
                engine[row][col] = '.';
            }

        }

        //top middle
          if(Character.isDigit(engine[row - 1][col])) {
            while(Character.isDigit(engine[row][col - 1])) {
                col--;
            }

            while(Character.isDigit(engine[row][col])) {
                total += engine[row][col];
                col++;
                engine[row][col] = '.';
            }

        }

        //top right
        if(Character.isDigit(engine[row - 1][col + 1])) {
            while(Character.isDigit(engine[row][col - 1])) {
                col--;
            }

            while(Character.isDigit(engine[row][col])) {
                total += engine[row][col];
                col++;
                engine[row][col] = '.';
            }

        }

        //middle left
        if(Character.isDigit(engine[row][col - 1])) {
            while(Character.isDigit(engine[row][col - 1])) {
                col--;
            }

            while(Character.isDigit(engine[row][col])) {
                total += engine[row][col];
                col++;
                engine[row][col] = '.';
            }

        }

        //middle right
        if(Character.isDigit(engine[row][col + 1])) {
            while(Character.isDigit(engine[row][col - 1])) {
                col--;
            }

            while(Character.isDigit(engine[row][col])) {
                total += engine[row][col];
                col++;
                engine[row][col] = '.';
            }

        }

        //bottom left
        if(Character.isDigit(engine[row + 1][col - 1])) {
            while(Character.isDigit(engine[row][col - 1])) {
                col--;
            }

            while(Character.isDigit(engine[row][col])) {
                total += engine[row][col];
                col++;
                engine[row][col] = '.';
            }

        }

        //bottom middle
        if(Character.isDigit(engine[row + 1][col])) {
            while(Character.isDigit(engine[row][col - 1])) {
                col--;
            }

            while(Character.isDigit(engine[row][col])) {
                total += engine[row][col];
                col++;
                engine[row][col] = '.';
            }

        }

        //bottom right
        if(Character.isDigit(engine[row + 1][col + 1])) {
            while(Character.isDigit(engine[row][col - 1])) {
                col--;
            }

            while(Character.isDigit(engine[row][col])) {
                total += engine[row][col];
                col++;
                engine[row][col] = '.';
            }

        }

        return total;
    }
}
