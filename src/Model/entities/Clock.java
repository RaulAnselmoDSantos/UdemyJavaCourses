package Model.entities;

public abstract class Clock {

    /*
     *    TODO´s:
     *     return the hour in format HH:mm:ss
     *     create 2 classes from clock to return
     *     hours in 24 hours an 12 hours format
     */

    protected int hour;
    protected int minute;
    protected int second;
    protected String period;


    public Clock(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        if (
                period != null &&
                (period.equalsIgnoreCase("PM")
                || period.equalsIgnoreCase("AM"))
        )
        {
            this.period = period.toUpperCase();
        } else System.out.print("Invalid period");
    }

    public abstract void sincronize(Clock otherClock);

    public abstract int getFormat();

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    abstract void setHour(int hours);

    protected void setMinute(int minute){
        if (minute < 0 || minute > 59) {
            System.out.println("Invalid minute, must be between 0 and 59");
            this.minute = 0;
        } else {
            this.minute = minute;
        }

    }

    protected void setSecond(int second) {
        if (second < 0 || second > 59) {
            System.out.println("Invalid minute, must be between 0 and 59");
            this.second = 0;
        } else {
            this.second = second;
        }

    }

    protected void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public boolean verifyFormat(Clock otherClock) {
        if (!(otherClock.getFormat() == this.getFormat())) {
            return false;
        }
        return true;
    }

    public abstract String returnHours();

}
