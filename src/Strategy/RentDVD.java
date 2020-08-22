package Strategy;

import java.util.Scanner;

public class RentDVD {
    public void DVDRental() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the type of DVD to Rent \n " + "[1] New Release \n " + "[2] Old Release \n " + "[3] Children Release");
        String answer = scanner.nextLine();
        DVDRentalRate rentalRate;

        if (answer.equals("1")) {
            rentalRate = new DVDRentalRate(new NewReleaseRate());
            System.out.println("The cost for New Release DVD is €" + rentalRate.executeRate(1) + "\n");

        }
        if (answer.equals("2")) {
            rentalRate = new DVDRentalRate(new OldReleaseRate());
            System.out.println("The cost for Old Release DVD is €" + rentalRate.executeRate(1));
        }
        if (answer.equals("3")) {
            rentalRate = new DVDRentalRate(new ChildrenRate());
            System.out.println("\nThe cost for ChildrenRate DVD is €" + rentalRate.executeRate(1));
        } else {
            scanner.close();
        }

    }
}
