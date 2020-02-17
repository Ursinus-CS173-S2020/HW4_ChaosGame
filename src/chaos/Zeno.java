/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaos;
import chaos.StdDraw;
/**
 *
 * @author ctralie
 */
public class Zeno {
    public static void main(String[] argv) {
        double x = 0.5;
        double y = 0.5;
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.BLUE);
        int count = 0;
        while (count < 100) {
            StdDraw.point(x, y);
            x = x/2;
            y = y/2;
            count++;
        }
    }
}
