package entities;

public class Clock24HoursFormat extends Clock{

    public final int format = 24;

    public Clock24HoursFormat(int hour, int minute, int second) {
        super(hour, minute, second);
        setHour(hour);
    }

    @Override
    public int getFormat() {
        return this.format;
    }

    @Override
    public void sincronize(Clock otherClock) {
        if (verifyFormat(otherClock)){
            setTime(otherClock.hour,  otherClock.minute, otherClock.second);
        } else {
            int otherHour = otherClock.getHour();
            String otherPeriod = otherClock.getPeriod();
            if (otherPeriod.equalsIgnoreCase("PM")) {
                if (otherHour == 12) {
                    setHour(12); // 12 PM é 12:00 (Meio-dia)
                } else {
                    setHour(otherHour + 12); // 1 PM vira 13, etc.
                }
            } else { // Se for AM
                if (otherHour == 12) {
                    setHour(0); // 12 AM é 00:00 (Meia-noite)
                } else {
                    setHour(otherHour); // 1 AM vira 1, etc.
                }
            }
            setMinute(otherClock.getMinute());
            setSecond(otherClock.getSecond());
        }
    }

    @Override
    void setHour(int hours) {
        if (hours < 0 || hours > 23){
            System.out.println("Hours out of range (0-23)");
            this.hour = hours;
        } else {
            this.hour = hours;
        }
    }

    @Override
    public String returnHours() {
        //Must return in the forman: HH:mm:ss
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%02d", hour)).append(":")
                .append(String.format("%02d", minute))
                .append(":").append(String.format("%02d", second));
        return sb.toString();
    }

}
