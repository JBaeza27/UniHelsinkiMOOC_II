package mooc;

import mooc.logic.ApplicationLogic;
import mooc.ui.UserInterface;
import mooc.ui.TextInterface;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello packages!");
//        UserInterface in = new UserInterface(); 
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);

    }
}
