import java.io.IOException;
import java.lang.Object;
import java.net.URLConnection;
import java.io.InputStream;


public class WikipediaConnect {
    private static URLConnection getWikiPage() throws IOException{
        URL url = new URL("https://en.wikipedia.org");
        URLConnection connection = url.openConnection();
        connection.setRequestProperty("User-Agent", "Revision Reporter/0.1 (me@bsu.edu)");
        InputStream inputStream = connection.getInputStream();
    }



    public URLConnection openConnection() {
        return null;
    }

    public String getWikiPage(String UserInput){
        static String encode(UserInput, "www.wikipedia.com");

    }











}
