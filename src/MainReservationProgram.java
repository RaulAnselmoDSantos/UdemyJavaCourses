import Model.entities.Reservation;
import Model.exception.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainReservationProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            System.out.print("Enter Room Number: ");
            int roomNumber = sc.nextInt();
            System.out.println("Check-in date (dd/MM/yyyy): )");
            Date checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy): )");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.println("Checkin date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch (ParseException e){
            System.out.println("Invalid date entered. Please try again.");
        }
        catch (DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error occured. Please try again.");
        }
        sc.close();
    }
}
