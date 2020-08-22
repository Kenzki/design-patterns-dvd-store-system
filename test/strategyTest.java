import Strategy.ChildrenRate;
import Strategy.NewReleaseRate;
import Strategy.OldReleaseRate;
import org.junit.Test;
import static org.junit.Assert.*;

public class strategyTest {

    @Test
    public void getRateOldRelease() {
        assertEquals(2, new OldReleaseRate().getRate(1));
    }
    @Test
    public void getRateNewRelease() {
        assertEquals(3, new NewReleaseRate().getRate(1));
    }
    @Test
    public void getRateChildren() {
        assertEquals(1, new ChildrenRate().getRate(1));

    }
}