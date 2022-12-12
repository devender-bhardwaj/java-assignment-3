import java.util.Scanner;

public class Square {
    public static void print(int x) {
        if (x == 0) {
            return ;
        }
        for (int i = 0; i < x-1; ++i) {
            System.out.print("  ");
        }
        System.out.print("|");
    }

    public static void main(String[] args) {
        // Line height is unit of lenght
        // To make it look like square line height is consider twice '-' (character) width
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of base of triangle:");
        int base = sc.nextInt();
        sc.close();

        for (int i = 0; i < base; ++i) {
            System.out.print("--");
        }
        System.out.println();
        for (int i = 1; i <= base; ++i) {
            print(1);
            print(base );
            System.out.println();
        }
        for (int i = 0; i < base; ++i) {
            System.out.print("--");
        }

    }
}
