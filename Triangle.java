import java.util.Scanner;

public class Triangle {
    public static void print(int x) {
        for (int i = 0; i < x-1; ++i) {
            System.out.print(" ");
        }
        System.out.print("*");
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of base of triangle:");
        int base = sc.nextInt();

        int halfbase = base/2;
        base = halfbase*2; //This is used to make length of base even
        sc.close();
        
        print(halfbase);
        System.out.println();
        for (int i = halfbase -1  , count = 1; i > 0; --i, ++count) {
            print(i);
            print(count*2);
            System.out.println();
        }
        for (int i = 0; i < base; ++i) {
            System.out.print("*");
        }
        
    }
}
