
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        Random random = new Random();
        for(int i = 0; i < 7; i++){
            int numberDrawn = 1 + random.nextInt(40);
            // while the number is in the array list
            while(containsNumber(numberDrawn)){
                numberDrawn = 1 + random.nextInt(40);
            }
            this.numbers.add(numberDrawn);
        }
        // the method containsNumber is probably useful
        
        
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        return this.numbers.contains(number);
    }
}

