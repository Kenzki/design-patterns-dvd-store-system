import DVDs.DVD;
import Decorator.BundleDeal;
import Decorator.DrinkBundle;
import Decorator.NewRelease;
import Decorator.SnackBundle;
import Observer.Newsletter;
import State.*;
import Store.Store;
import Strategy.*;
import Template.Action;
import Members.*;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Newsletter newsletter;

        Store DVDStore = Store.getInstance();

        System.out.println("---------- Welcome to DVD Store System ----------\n");

        Date date = new Date();
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date);
        calendar1.set(Calendar.HOUR_OF_DAY, 12);

        Date date2 = new Date();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        calendar2.set(Calendar.HOUR_OF_DAY, 13);

        Date date3 = new Date();
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTime(date3);

        Date x = calendar3.getTime();
        if (x.after(calendar1.getTime()) && x.before(calendar2.getTime())) {
            DVDStore.storeLunch();
            System.exit(0);
        } else
            DVDStore.storeOpen();

        if (DVDStore.storeStatus() == true) {


        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\nChoose an option to start...\n" + "\n[1] Rent a DVD \n" + "[2] Add a New DVD \n" + "[3] Bundle Deal\n" + "[4] Send News Letters\n" + "[5] Check Availability\n");
        String answer = sc.nextLine();

        if(answer.equals("1"))
        {
            RentDVD RentDVD = new RentDVD();
            RentDVD.DVDRental();
        }

        if(answer.equals("2")){
            DVD dvd = new DVD("Avengers: Endgame", "yyyyy","xxxxx","2019");

            Action movie = new Action(dvd);
            System.out.println(movie.addMovie());
        }

        if(answer.equals("3")){

            BundleDeal bundleNewRelease = new NewRelease();
            bundleNewRelease = new SnackBundle(bundleNewRelease);
            bundleNewRelease = new DrinkBundle(bundleNewRelease);
            System.out.println(bundleNewRelease.getDescription()
                    + " are €" + bundleNewRelease.cost()+ "\n");

        }

        if(answer.equals("4")){
            newsletter = new Newsletter();
            newsletter.setNews("The Avengers for only €1.99, etc..\n" + "\nThank you for subscribing to out Newsletter");

        }

        if(answer.equals("5")){

            State status = new RentalStatusInactive();
            status.rentalStatus();
        }




    }
}
