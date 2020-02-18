/**
 * This program explores the "10 heads game," in which we flip
 * coins until we get 10 heads in a row
 */
package chaos;
import java.util.Random;


public class TenHeads {
    public static void main(String[] args) {
        Random rand = new Random();
        int experiment = 0;
        while (experiment < 10000) {
            // Outer loops is for experiments starting from scratch
            int numFlips = 0, headsInRow = 0;
            while (headsInRow < 10) {
                // Inner loop flips until 10 heads are seen
                int coinFlip = rand.nextInt(2);
                if (coinFlip == 0) {
                    // This is a heads
                    headsInRow++;
                }
                else {
                    // This is a tails
                    // Need to reset the heads in a row
                    headsInRow = 0;
                }
                numFlips++; // Short for numFlips = numFlips + 1
            }
            System.out.print(numFlips + ",");
            experiment++;
        }
    }
}
