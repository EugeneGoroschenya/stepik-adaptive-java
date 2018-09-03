import java.util.Scanner;

import static java.util.concurrent.TimeUnit.*;

public class Task13 {

    /**
     * https://stepik.org/lesson/43121/step/1?adaptive=true&unit=21185
     *
     * <p>
     * Digital watches
     * <p>
     * Digital watches display time in the h:mm:ss format (from 0:00:00 to 23:59:59), i.e. first goes the number of hours, then goes the two-digit number of minutes, followed by the two-digit number of seconds. If necessary, number of minutes and seconds are filled by zeroes to a two-digit number.
     * <p>
     * N seconds passed from the beginning of the day. Output what the watches will display.
     * <p>
     * Input data format
     * <p>
     * Given the natural number N on input, not exceeding 107 (10000000).
     * <p>
     * Sample Input 1:
     * <p>
     * 3602
     * Sample Output 1:
     * <p>
     * 1:00:02
     * Sample Input 2:
     * <p>
     * 129700
     * Sample Output 2:
     * <p>
     * 12:01:40
     */
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();
        long h = (n % DAYS.toSeconds(1)) / HOURS.toSeconds(1);
        long m = (n % HOURS.toSeconds(1)) / MINUTES.toSeconds(1);
        long s = n % MINUTES.toSeconds(1);
        System.out.printf("%d:%02d:%02d", h, m, s);
    }

}


