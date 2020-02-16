package chaos;
import chaos.StdDraw;

public class LineSegments {
    /**
     * An example method to help students to see use of loops
     * in concert with StdDraw to draw a bunch of points evenly
     * sampled along a line segment
     * 
     * @param startx X coordinate of the first point on the line.
     *               Should be in [0, 1].
     * @param starty Y coordinate of the first point on the line.
     *               Should be in [0, 1].
     * @param endx X coordinate of the last point on the line.
     *               Should be in [0, 1].
     * @param endy Y coordinate of the last point on the line.
     *               Should be in [0, 1].
     * @param numPoints Number of points to draw
     */
    public static void drawPointsOnLine(double startx, double starty, 
                                        double endx, double endy, 
                                        int numPoints) {
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.BLUE);
        assert(numPoints >= 2);
        double dx = (endx - startx)/(numPoints-1);
        double dy = (endy - starty)/(numPoints-1);
        for (int i = 0; i < numPoints; i++) {
            double x = startx + dx*i;
            double y = starty + dy*i;
            StdDraw.point(x, y);
        }
    }
    
    /**
     * An example method that draws an X by calling 
     * drawPointsOnLine twice
     */
    public static void drawX() {
        drawPointsOnLine(0.1, 0.1, 0.9, 0.7, 50);
        drawPointsOnLine(0.1, 0.7, 0.9, 0.1, 50);
    }
    
    public static void main(String[] args) {
        drawX();
    }
}
