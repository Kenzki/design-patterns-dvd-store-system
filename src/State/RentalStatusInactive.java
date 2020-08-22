package State;

public class RentalStatusInactive implements State {
    @Override
    public void rentalStatus(){
        System.out.println("DVD is available to Rent\n");
    }
}