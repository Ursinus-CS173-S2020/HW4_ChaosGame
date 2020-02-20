package chaos;

/**
 *
 * Make a parallelogram of hahas with a nested for loop
 * 
 * @author ctralie
 */
public class Haha {
    public static void main(String[] args) {
        String s = "";
        int N = 200;
        for (int i = 0; i < N; i++) {
            s = s + "ha";
            if (i > 0 && i % 20 == 0) {
                // Every 20 "ha"s, we want to add a line
                // break (\n), and we also add two more
                // spaces at the beginning each time
                // by using a nested loop
                s = s + "\n";
                for (int j = 0; j < i / 20; j++) {
                    s = s + "  ";
                }
            }
        }
        System.out.println(s);
    }
}
