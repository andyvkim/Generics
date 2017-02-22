import kim.andy.MySet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by andykim on 2/22/17.
 */
public class part2Test {

    MySet mySet;
    Object[] testSet = new Object[1];

    @Before
    public void setUp(){
        mySet = new MySet();
        mySet.AddnoRepeats(testSet, 0);
        mySet.AddnoRepeats(testSet, 0);
    }

    @Test
    public void noRepeatsTest(){
        int expected = 1;
        int actual = testSet.length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest(){
        boolean expected = true;
        boolean actual = mySet.contains(testSet, 0);
        Assert.assertEquals(expected, actual);
    }
}
