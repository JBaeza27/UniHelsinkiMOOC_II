
public class Main {

    public static void main(String[] args) {
        Box box = new Box(10);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
        
        //Box inside a box
        
        System.out.println(box);
        System.out.println(box.weight());

        
        Box box2 = new Box(3);
        box2.add(new Book("Author", "Harry Potter", 2));
        
        box.add(box2);
        
        System.out.println(box.weight());
        System.out.println(box);
  
    }
}
