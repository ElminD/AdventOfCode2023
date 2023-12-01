import java.io.File; 
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        try {
            File myObj = new File("Day01/src/input.txt");
            Scanner myReader = new Scanner(myObj);
            int total = 0;
            
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              int first = 0;
              int last = 0;
              String[] numbers = {
                "one1", "two2", "three3", "four4", "five5", "six6", "seven7", "eight8", "nine9"
            };

              StringBuilder sb = new StringBuilder(data);

              for(int i = 0; i < numbers.length; i++){
                
                System.out.println(data.contains(numbers[i].substring(0, numbers[i].length()-2)));
                data.replace(numbers[i].substring(0, numbers[i].length()-2),"" + numbers[i].charAt(numbers[i].length()- 1));
                System.out.println(numbers[i].substring(0, numbers[i].length()-1));

              }

               System.out.println("data: " + data);

              // System.out.println("first: " + first);
              // System.out.println("last: " + last);
              // System.out.println("data: " + data);




              if(first == last){
                last = 0;
              }
              total += first + last;
              System.out.println(first + last);
            }
            System.out.println("Total: " + total);
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}
