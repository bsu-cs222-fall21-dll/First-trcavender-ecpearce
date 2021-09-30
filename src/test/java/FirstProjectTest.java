import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URLConnection;

public class FirstProjectTest {
    @Test

    public void test () throws IOException {
        ReceiveUserInput newInput = new ReceiveUserInput();
        newInput.completeUrl(newInput.userSearchWikipedia());


    }
}
