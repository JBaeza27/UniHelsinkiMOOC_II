
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        
    }
    
    public static List<Book> readBooks(String file){
        ArrayList<Book> contents = new ArrayList<>();
        try{
            Files.lines(Paths.get(file))
                    .map(i -> i.split(","))
                    .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
                    .forEach(content -> contents.add(content));
            //collect(Collectors.toList());
        }catch(Exception E){
            System.out.println("Error: " + E.getMessage());
        }
        //return new ArrayList<>();
        return contents;
        
    }

}
