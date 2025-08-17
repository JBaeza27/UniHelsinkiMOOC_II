
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {

     

        ArrayList<Literacy> contents = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(l -> l.split(","))
                    .map(lit -> new Literacy(lit[2].replace("(%)", "").trim(), lit[3], Integer.valueOf(lit[4]), Double.parseDouble(lit[5])))
                    .forEach(t -> contents.add(t));
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        contents.stream().sorted((t1, t2) -> {
            if (t1.getLiteracyPercent() > t2.getLiteracyPercent()) {
                return 1;
            }
            if (t1.getLiteracyPercent() < t2.getLiteracyPercent()) {
                return -1;
            }
            return 0;
        }).forEach(t -> System.out.println(t));
    }
}
