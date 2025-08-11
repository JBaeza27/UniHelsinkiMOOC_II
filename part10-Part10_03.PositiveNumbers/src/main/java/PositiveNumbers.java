
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

        // toteuta ohjelmasi tänne
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(-8);
        numbers.add(-11);
        numbers.add(-3);
        numbers.add(1);
        numbers.add(8);
        numbers.add(1);
       
        System.out.println(positive(numbers));

    }
    //either or for making a list again for processing the data
    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> total = numbers.stream()
                .filter(i -> i > 0)
//                .collect(Collectors.toCollection(ArrayList::new));
                .collect(Collectors.toList());
        return total;
    }

}
