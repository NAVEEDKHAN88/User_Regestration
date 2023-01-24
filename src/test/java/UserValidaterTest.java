
import org.junit.Assert;
import org.junit.Test;

public class UserValidaterTest {
    @Test
    public void givenPassword_WhenProper_ShouldReturn_True() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validatePassword("1234AA5678");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_WhenNotProper_ShouldReturn_False() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validatePassword("123asdfgh");
        Assert.assertEquals(false,result);
    }
}