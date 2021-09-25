import java.io.IOException;
import java.lang.Object;
import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;


public class WikipediaConnect {
        private static URLConnection makeConnection(String Url) throws IOException{
             URL url = new URL("https://en.wikipedia.org");
             URLConnection connection = url.openConnection();
             connection.setRequestProperty("User-Agent", "Revision Reporter/0.1 (me@bsu.edu)");
             InputStream inputStream = connection.getInputStream();
             connection.connect();
             return connection;
        }


    public URLConnection openConnection() {
        return null;
    }

// get user input, and search wiki for input, if input is found 100%, return. If input is redirected, give
    // is ___ what you were looking for T or F. If T, return page, if F, either keep searching or give not found
    // if page is not found. return not found


}
