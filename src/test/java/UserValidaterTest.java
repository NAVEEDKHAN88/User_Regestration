
import org.junit.Assert;
import org.junit.Test;

public class UserValidaterTest {
    @Test
    public void givenPhone_WhenProper_ShouldReturn_True() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validatePhone("918867866123");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPhone_WhenNotProper_ShouldReturn_False() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validatePhone("8867866123");
        Assert.assertEquals(false,result);
    }
}