import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {
    Addtion addtion = new Addtion();
    //Testcase 1 addtion of empty string returns 0
    @Test
    public void AdditonEmptyStringAndOneIsZero(){
        Assert.assertEquals(0, addtion.Add("","1"));
    }
    //Testcase 2 addtion of two string 1 and 2 returns their sum 3
    @Test
    public void AdditionOfOneAndTwoIsThree(){
        Assert.assertEquals(3,addtion.Add("1","2"));
    }
}
