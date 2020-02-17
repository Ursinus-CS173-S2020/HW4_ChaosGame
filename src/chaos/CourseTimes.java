/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaos;
import java.util.Scanner;
/**
 *
 * @author ctralie
 */
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
