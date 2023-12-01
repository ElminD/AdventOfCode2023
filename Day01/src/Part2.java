import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Scanner; 

public class Part2 {
    public static void main(String[] args) throws Exception {
        int total = 0;
        try {
           File myObj = new File("Day01/src/input.txt");
           Scanner myReader = new Scanner(myObj);

           String[] numbers = {
                "zero0", "one1", "two2", "three3", "four4", "five5", "six6", "seven7", "eight8", "nine9"
            };
            
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              String first = "";
              String last = "";

              for(int i = numbers.length - 1; i > -1; i--){
                data = data.replace(numbers[i].substring(0, numbers[i].length()-1),numbers[i].substring(0, numbers[i].length()-1) + numbers[i].charAt(numbers[i].length()- 1) + numbers[i].substring(0, numbers[i].length()-1));
              }

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
