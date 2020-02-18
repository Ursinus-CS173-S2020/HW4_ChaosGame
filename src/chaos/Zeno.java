/**
 * A program that explores Zeno's paradox by starting
 * with a point (0.5, 0.5) and repeatedly halving
 * the coordinates
 */
package chaos;
import chaos.StdDraw;

public class Zeno {
    public static void main(String[] argv) {
        double x = 0.5;
        double y = 0.5;
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.BLUE);
        int count = 0;
        while (count < 100) {
            StdDraw.point(x, y);
            // Halve the coordinates
            x = x/2;
            y = y/2;
            count++;
            // Wait a half a second in between iterations
            StdDraw.pause(500);
        }
    }
}
