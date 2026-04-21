package Model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkIn = checkin;
        this.checkOut = checkout;
    }

    public Date getCheckin() {
        return checkIn;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckout() {
        return checkOut;
    }

    public long duration(){
        //difference between two dates in milliseconds
        long diff = checkOut.getTime() - checkIn.getTime();
        //Operation with time units for days conversion, using the diff milliseconds to days
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reservation: ").append(" Room " + roomNumber)
                .append(" CheckIn: " + sdf.format(checkIn))
                .append(", CheckOut: " + sdf.format(checkOut))
                .append(", " +  "nights");
        return sb.toString();

    }
}
