import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {
    @Test
    public void TwoAndThreeIsFive(){
        Addtion addtion = new Addtion();
        Assert.assertEquals(5,addtion.Add("2","3"));
    }
}
