/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {



    @Test public void testIfIsWriteToFile (){
        String path ="src/main/resources/data.json";
        Quotes readFromFile = new Quotes();
        readFromFile.read(path);

        Api getNewQuote = new Api();
        getNewQuote.sendGetRequest();
        Quotes readFromFileWithNewQuote = new Quotes();
        readFromFileWithNewQuote.read(path);

        assertEquals("check if write new lin to thr file",readFromFile.getQuotes().length+1,readFromFileWithNewQuote.getQuotes().length);

    }

    private void assertEquals(String s, int i, int length) {
    }
}
