import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URLConnection;

public class FirstProjectTest {
    @Test

    public void test () throws IOException {
        WikipediaConnect wiki = new WikipediaConnect();
        wiki.URLConnection("wikipedia.com/frank-zappa");


    }
}
