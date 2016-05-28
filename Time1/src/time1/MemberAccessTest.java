
package time1;

/**
 *
 * @author Matthew Ford
 */
public class MemberAccessTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Time1 time = new Time1();
        
        // output string representations of the time
        System.out.print("The initial universal time is: ");
        System.out.println(time.toUniversalString());
        System.out.print("The initial standard time is: ");
        System.out.println(time.toString());
        System.out.println(); // output a blank line

        // change time and output updated time
        time.setTime(13, 27, 6);
        System.out.print("Universal time after setTime is: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time after setTime is: ");
        System.out.println(time.toString());
        System.out.println(); // output a blank line
        
        time.setHour(7);
        time.setMinute(15); 
        time.setSecond(30);
        
        System.out.print("Universal time after set individual hour, minute, second, is: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time after setting individual hour, minute, second, is: ");
        System.out.println(time.toString());
        System.out.println(); // output a blank line

    }
}

