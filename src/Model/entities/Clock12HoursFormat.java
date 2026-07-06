package Model.entities;

public class Clock12HoursFormat extends Clock{

    public final int format = 12;
    public String period;

    public Clock12HoursFormat(int hour, int minute, int second, String period) {
        super(hour, minute, second);
        setPeriod(period);
    }

    @Override
    public int getFormat() {
        return this.format;
    }

    @Override
    public void sincronize(Clock otherClock) {
        if (verifyFormat(otherClock)){
            setTime(otherClock.hour,  otherClock.minute, otherClock.second);
            setPeriod(otherClock.period);
        } else {
            int otherHour = otherClock.getHour();

            if (otherHour == 0) { // Meia-noite
                setPeriod("AM");
                setHour(12);

            } else if (otherHour == 12) { // Meio-dia
                setPeriod("PM");
                setHour(12);
            } else if (otherHour > 12) { // Tarde/Noite
                setPeriod("PM");
                setHour(otherHour - 12);
            } else { // Madrugada/Manhã
                setPeriod("AM");
                setHour(otherHour);
            }

            setMinute(otherClock.getMinute());
            setSecond(otherClock.getSecond());
        }
    }

    @Override
    void setHour(int hours) {
        if (hours < 1 || hours > 12){
            System.out.println("Hours out of range (1-12)");
            this.hour = 12;
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
                .append(":").append(String.format("%02d", second))
                .append(" " + getPeriod());
        return sb.toString();
    }
}
