
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> inputs = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        
        String input;
        
        while(true){
            input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            inputs.add(input);
        }
        
         double positive = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(s -> Integer.valueOf(s) > 0)
                .average()
                .getAsDouble();
         
        // or .filter(s -> s < 0)
        // or .mapToInt(s -> s)
          double negative = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(s -> Integer.valueOf(s) < 0)
                .average()
                .getAsDouble();
        
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        input = scanner.nextLine();
        if(input.equals("n")){
            System.out.println("Average of the negative numbers: " + negative);
        }else if(input.equals("p")){
            System.out.println("Average of the positive numbers: " + positive);
        }
       
        
        
        
       
    }
}
