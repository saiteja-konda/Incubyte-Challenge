import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {
    Addtion addtion = new Addtion();
/* Task one */

    //Testcase 1 addtion of empty string returns 0
    @Test
    public void AdditonEmptyStringAndOneIsZero() throws NegitiveNumberNotAllowedException {
        Assert.assertEquals(0, addtion.Add(""));
    }
    //Testcase 2 addtion of two string 1 and 2 returns their sum 3
    @Test
    public void AdditionOfOneAndTwoIsThree() throws NegitiveNumberNotAllowedException {
        Assert.assertEquals(3,addtion.Add("1,2"));
    }

/* Task two */

    //Testcase 3 addtion of unknown numbers from the given string
    @Test
    public void AddtionOfNumberforString() throws NegitiveNumberNotAllowedException {
        Assert.assertEquals(10,addtion.Add("1,2,3,4"));
    }

    //Testcase 4 Support different delimiters
    @Test
    public void differentDelimiters() throws NegitiveNumberNotAllowedException {
        Assert.assertEquals(6,addtion.Add("1\n2,3"));
    }
//Testcase 5 Not Negative Numbers allowed
    @Test(expected = NegitiveNumberNotAllowedException.class)
    public void NoNegtiveNumbers() throws  NegitiveNumberNotAllowedException {
        Assert.assertEquals("Negative numbers are not allowed",addtion.Add("1,-2"));
    }
}
