/**
 * An introduction to loops with a program that asks
 * for how many classes a student is taking, and which
 * then asks for how many hours they are spending on
 * each class.  It takes a running total of time and
 * displays the result at the end
 */
package chaos;
import java.util.Scanner;

public class CourseTimes {
    
    public static void main(String[] args) {
        System.out.print("How many classes are you taking: ");
        Scanner in = new Scanner(System.in);
        int numClasses = in.nextInt();
        int counter = 1;
        int totalHours = 0;
        while (counter <= numClasses) {
            System.out.print("How many hours on class " + counter + ": ");
            int hours = in.nextInt();
            totalHours = totalHours + hours;
        }
        System.out.println("Total Hours: " + totalHours);
    }
}
