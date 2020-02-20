package chaos;

/**
 *
 * @author ctralie
 */
public class ArithmeticSeries {
    public static void main(String[] args) {
        int N = 100;
        int x = 0; // Running total
        /*int i = 1;
        while (i <= N) {
            x = x + i;
            i++;
        }*/
        // This problem is more natural with a for
        // loop since we know exactly where we want
        // to start and exactly where we want to end
        for (int i = 1; i <= N; i++) {
            x = x + i;
        }
        System.out.println(x);
        System.out.println(N*(N+1)/2);
        
    }
}
