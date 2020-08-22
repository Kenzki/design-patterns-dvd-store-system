import static org.junit.Assert.*;
import State.*;
import org.junit.Test;

public class stateTest {

    @Test
    public void rentalStatusActive() {
        State status = new RentalStatusActive();
        status.rentalStatus();
    }

    @Test
    public void rentalStatusInactive() {
        State status = new RentalStatusInactive();
        status.rentalStatus();
    }

    @Test
    public void rentalStausUnavialable() {
        State status = new RentalStatusUnavailable();
        status.rentalStatus();
    }


}