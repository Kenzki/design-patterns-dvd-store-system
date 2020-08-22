package State;

public class RentalStatusUnavailable implements State {
    @Override
    public void rentalStatus(){
        System.out.println("DVD is not Available\n");
    }
}
