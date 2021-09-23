import java.lang.Object;
import java.net.URLEncoder;
import java.net.URLConnection;

public class WikipediaConnect {

    public URLConnection openConnection(){
        //https://en.wikipedia.org/wiki/Special:ApiSandbox
        // use sandbox to find recent updates?

        URL url = new URL("https://en.wikipedia.org");
        URLConnection connection = url.openConnection();
        connection.setRequestProperty("User-Agent", "Revision Reporter/0.1 (me@bsu.edu)");
        InputStream inputStream = connection.getInputStream();


    }

    public String getWikiPage(String UserInput){
        static String encode(UserInput, "www.wikipedia.com");

    }








}
