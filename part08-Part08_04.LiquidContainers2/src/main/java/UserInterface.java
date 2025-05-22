/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sierra02
 */
import java.util.Scanner;

public class UserInterface {

    private Container first;
    private Container second;
    private Scanner scan;

    public UserInterface(Container first, Container second, Scanner scan) {
        this.first = first;
        this.second = second;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            input = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (input.equals("add")) {
                this.first.add(amount);
            }

            if (input.equals("move") && amount > 0) {
                if (amount > this.first.contains()) {
                    amount = first.contains();
                }
                this.first.remove(amount);
                this.second.add(amount);

            }

            if (input.equals("remove")) {
                second.remove(amount);
            }
        }
    }
}
