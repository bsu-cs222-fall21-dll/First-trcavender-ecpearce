import javax.swing.JOptionPane;

public class ReceiveUserInput {

    public String userSearchWikipedia(){
        String userInput = JOptionPane.showInputDialog("What would you like to search?");
        return userInput;
    }
}
