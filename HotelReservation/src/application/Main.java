package application;

import entities.Reservation;
import entities.util.Checks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room number: ");
        int roomNumber = sc.nextInt();
        System.out.println("Checkin: ");
        Date checkin = sdf.parse(sc.next());
        System.out.println("Checkout: ");
        Date checkout = sdf.parse(sc.next());

        Checks.jumpLine();

        Reservation res = null;
        if (Checks.check(checkin, checkout)) {
            res = new Reservation(roomNumber, checkin, checkout);
            System.out.println(res);
        } else {
            Checks.msgInconsistentData();
            while (res == null) {
                System.out.println("== try again ==");
                System.out.println("Checkin: ");
                checkin = sdf.parse(sc.next());
                System.out.println("Checkout: ");
                checkout = sdf.parse(sc.next());
                if (Checks.check(checkin, checkout)) {
                    res = new Reservation(roomNumber, checkin, checkout);
                    System.out.println(res);
                }
            }
        }

        Checks.jumpLine();
        System.out.println("=== Update reservation ===");
        System.out.println("New checkin: ");
        checkin = sdf.parse(sc.next());
        System.out.println("new checkout: ");
        checkout = sdf.parse(sc.next());

        res.updateDates(checkin, checkout);
        System.out.println(res);

        sc.close();
    }


}
