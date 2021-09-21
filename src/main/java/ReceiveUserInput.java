import javax.swing.JOptionPane;

public class ReceiveUserInput {

    public static String userSearchWikipedia() {
        String userInput = JOptionPane.showInputDialog("What would you like to search?");
        return userInput;
    }
}
