import com.xshi.app.RemoveDuplicateWords;
import org.junit.Test;
import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testApp()
    {
        RemoveDuplicateWords rdw = new RemoveDuplicateWords();
        String sentence = "this is a book a this";
        Assert.assertEquals("this is a book",rdw.removeDuplicateWords(sentence));
    }
}
