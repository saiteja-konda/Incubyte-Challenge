import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {
    Addtion addtion = new Addtion();
/* Task one */

    //Testcase 1 addtion of empty string returns 0
    @Test
    public void AdditonEmptyStringAndOneIsZero(){
        Assert.assertEquals(0, addtion.Add(""));
    }
    //Testcase 2 addtion of two string 1 and 2 returns their sum 3
    @Test
    public void AdditionOfOneAndTwoIsThree(){
        Assert.assertEquals(3,addtion.Add("1,2"));
    }
/* Task two */

    //Testcase 3 addtion of unknown numbers from the given string
    @Test
    public void AddtionOfNumberforString(){
        Assert.assertEquals(10,addtion.Add("1,2,3,4"));
    }

}
