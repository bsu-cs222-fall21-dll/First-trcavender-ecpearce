public class UserInterface {

    public void displayInterface() {
        WikipediaConnect wikipediaConnect = new WikipediaConnect();
        wikipediaConnect.getWikiPage(ReceiveUserInput.userSearchWikipedia());
    }
}
