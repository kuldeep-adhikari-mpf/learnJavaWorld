package learnJava;

/**
 * Created by kuldeep.adhikari on 6/14/2017.
 */
import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void testLengthOfTheUniqueKey() {

        App obj = new App();
        Assert.assertEquals(36, obj.generateUniqueKey().length());

    }
}
