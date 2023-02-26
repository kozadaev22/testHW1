import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.CashbackHackService;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
    public void AmountMoreBoundary(){
        int actual = service.remain(2500);
        int expected = 500;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void AmountLessBoundary(){
        int actual = service.remain(640);
        int expected = 360;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void AmountEqualsBoundary(){
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
}
