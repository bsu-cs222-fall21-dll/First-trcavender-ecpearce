
import java.io.IOException;

public class UserInterface {

    public void displayInterface() throws IOException{
        ReceiveUserInput receiveUserInput = new ReceiveUserInput();
        WikipediaConnect wikipediaConnect = new WikipediaConnect();

        wikipediaConnect.URLConnection(receiveUserInput.giveUserInput());
    }
}
