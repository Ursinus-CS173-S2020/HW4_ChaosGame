/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaos;
import java.util.Random;

/**
 *
 * @author ctralie
 */
public class TenHeads {
    public static void main(String[] args) {
        Random rand = new Random();
        int experiment = 0;
        while (experiment < 10000) {
            int numFlips = 0, headsInRow = 0;
            while (headsInRow < 10) {
                int coinFlip = rand.nextInt(2);
                if (coinFlip == 0) {
                    // This is a heads
                    headsInRow++;
                }
                else {
                    // This is a tails
                    headsInRow = 0;
                }
                numFlips++; // numFlips = numFlips + 1
            }
            System.out.print(numFlips + ",");
            experiment++;
        }
    }
}
