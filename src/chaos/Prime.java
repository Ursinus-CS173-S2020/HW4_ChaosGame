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
public class Prime {
    public static boolean isPrime(int x) {
        boolean result = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                result = false;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        if(isPrime(num)) {
            System.out.println("It's a prime!");
        }
        else {
            System.out.println("It's a composite number");
        }
        
        // Now print out all of the primes from 2 to 100
        // We don't need to declare "num" in the for loop
        // because it's already been declared above
        for (num = 2; num <= 100; num++) {
            if(isPrime(num)) {
                System.out.print(num + ", ");
            }
        }
        
    }
}
