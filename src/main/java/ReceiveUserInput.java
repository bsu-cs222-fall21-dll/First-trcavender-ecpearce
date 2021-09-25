import javax.swing.JOptionPane;

public class ReceiveUserInput {

    public static String userSearchWikipedia() {
        String userInput = JOptionPane.showInputDialog("What would you like to search?");
        return userInput;
    }

    public String completeUrl(String userInput) {
        String beginningUrl = "https://en.wikipedia.org/w/api.php?action=query&format=json&prop=revisions&titles=";
        String userUrl = userInput;
        String endUrl = "&redirects=1&callback=&rvprop=timestamp%7Cuser&rvlimit=30";
        String completeUrl = beginningUrl + userUrl + endUrl;

        return completeUrl;

        //The idea of this method came from the work of wjgibson and wtwithers.
    }
}
