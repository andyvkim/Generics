
import kim.andy.MyArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by andykim on 2/22/17.
 */
public class part1Test {

    MyArrayList myArrayList;

    public part1Test() throws Exception {}

    @Before

    public void setUp() throws Exception {
        myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
    }
    @Test
    public void addTest(){
        int expected = 3;
        int actual = myArrayList.size();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void addAtIndexTest() throws Exception {
        myArrayList.add(1);
        Object expected = 1;
        Object actual = myArrayList.get(1);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getTest() throws Exception {
        Object expected = 1;
        Object actual = myArrayList.get(0);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void clearTest() throws Exception{
        myArrayList.clear();
        Object expected = 0;
        Object actual = myArrayList.get(1);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void isEmptyTest(){
        myArrayList.clear();
        boolean expected = true;
        boolean actual = myArrayList.isEmpty();
        Assert.assertEquals(expected, actual);
    }


}
