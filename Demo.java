import java.util.*;

public class Demo {

    public static void main(String[] args) {
        int a = 5;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {

                if (i == 0 || j == 0 || i == (a - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.print("  ");

            for (int j = 0; j < a; j++) {

                if () {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            System.out.println();
        }

    }
}