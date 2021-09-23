import java.io.IOException;
import java.lang.Object;
import java.net.URLConnection;
import java.io.InputStream;


public class WikipediaConnect {
        public static void main(String[] args) throws Exception{
        URL url = new URL("https://en.wikipedia.org");
        URLConnection connection = url.openConnection();
        connection.setRequestProperty("User-Agent", "Revision Reporter/0.1 (me@bsu.edu)");
        InputStream inputStream = connection.getInputStream();
        return IOException;
    }


    public URLConnection openConnection() {
        return null;
    }



}
