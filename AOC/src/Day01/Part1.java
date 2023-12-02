package Day01;
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Scanner; 

public class Part1 {
    public static void main(String[] args) throws Exception {
        int total = 0;
        try {
            File myObj = new File("AOC/src/Day01/input.txt");
            Scanner myReader = new Scanner(myObj);
    
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              String first = "", last = "";

              for(char c : data.toCharArray()){
                if(Character.isDigit(c)){
                  first = c + "";
                  break;
                }
              }      

              for(char c : data.toCharArray()){
                if(Character.isDigit(c)){
                  last = c + "";
                }
              }

              int digit = Integer.parseInt(first + last);
              total += digit;
            }
            System.out.println("Total: " + total);
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}
