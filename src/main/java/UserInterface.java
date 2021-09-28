
import java.io.IOException;

public class UserInterface {

    public void displayInterface() throws IOException{
        ReceiveUserInput receiveUserInput = new ReceiveUserInput();
        WikipediaConnect wikipediaConnect = new WikipediaConnect();

        String userUrl = receiveUserInput.completeUrl(receiveUserInput.userSearchWikipedia());
        wikipediaConnect.URLConnection(userUrl);
    }
}
