import java.io.IOException;
import java.lang.Object;
import java.net.ConnectException;
import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;


public class WikipediaConnect {
        public InputStream URLConnection (String Url) throws IOException{
            try {
                URL url = new URL(Url);
                URLConnection connection = url.openConnection();
                connection.setRequestProperty("User-Agent", "FirstProject/0.1 (ecpearce@bsu.edu)");
                InputStream inputStream = connection.getInputStream();
                connection.connect();
                return inputStream;
            }
            catch(ConnectException connectException){
                System.err.println("Unable to establish connection");
                System.exit(3);
                return null;
            }
        }



// get user input, and search wiki for input, if input is found 100%, return. If input is redirected, give
    // is ___ what you were looking for T or F. If T, return page, if F, either keep searching or give not found
    // if page is not found. return not found


}
