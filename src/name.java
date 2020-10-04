import java.util.Scanner;

/**
 * Created by student1 on 04.10.20.
 */
public class name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.next();
        Scanner in = new Scanner(System.in);
        double y = in.nextDouble();
        if (x * x + y * y >= 4 && x <= 2 && y <= x) System.out.printf("true");
        else
            System.out.printf("false");
    }
}


