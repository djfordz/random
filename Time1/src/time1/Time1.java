package time1;

/**
 *
 * @author Matthew Ford
 */
public class Time1 {

    private int hour;
    private int minute;
    private int second;

    // set a new time value using universal time; throw an
    // exception if the hour, minute or second is invalid
    public void setTime(int h, int m, int s) {
        // validate hour, minute and second
        if ((h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60)) {
            setHour(h);
            setMinute(m);
            setSecond(s);
        } else {
            throw new IllegalArgumentException("hour, minute and/or second was out of range");
        }
    }

    // validate and set hour
    public void setHour(int h) {
        if (h >= 0 && h < 24) {
            hour = h;
        } else {
            throw new IllegalArgumentException("hour must be 0-23");
        }
    }

    // validate and set minute
    public void setMinute(int m) {
        if (m >= 0 && m < 60) {
            minute = m;
        } else {
            throw new IllegalArgumentException("minute must be 0-59");
        }
    }

    // validate and set second
    public void setSecond(int s) {
        if (s >= 0 && s < 60) {
            second = ((s >= 0 && s < 60) ? s : 0);
        } else {
            throw new IllegalArgumentException("second must be 0-59");
        }
    }

 // Get Methods
    // get hour value
    public int getHour() {
        return hour;
    }

    // get minute value
    public int getMinute() {
        return minute;
    }

    // get second value
    public int getSecond() {
        return second;
    }

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    } // end method toUniversalString

    // convert to String in standard-time format (H:MM:SS AM or PM)
     public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    } // end method toString
}
