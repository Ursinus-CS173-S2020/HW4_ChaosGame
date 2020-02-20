/**
 * A program that draws a random walk
 */
package chaos;
import chaos.StdDraw;
import java.util.Random;

public class RandomWalk {
    public static void main(String[] argv) {
        double x = 0.5;
        double y = 0.5;
        final double A = 0.01;
        StdDraw.setPenRadius(A);
        StdDraw.setPenColor(StdDraw.BLUE);
        int count = 0;
        Random rand = new Random();
        while (count < 1e6) {
            StdDraw.point(x, y);
            int choice = rand.nextInt(4);
            /*switch(choice) {
                case 0:
                    x = x - A;
                    break;
                case 1:
                    x = x + A;
                    break;
                case 2:
                    y = y + A;
                    break;
                default:
                    y = y - A;
            }*/
            
            // Keep the random walk within a box where
            // 0.2 < x < 0.8 and 0.2 < y < 0.8
            if (choice == 0 && x > 0.2) {
                x = x - A;
            }
            else if (choice == 1 && x < 0.8) {
                x = x + A;
            }
            else if (choice == 2 && y < 0.8) {
                y = y + A;
            }
            else if (choice == 3 && y > 0.2) {
                y = y - A;
            }
            
            count++;
            // Wait a bit of time between points
            StdDraw.pause(10);
        }
    }
}
