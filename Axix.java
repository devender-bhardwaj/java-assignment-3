public class Axix {
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
        for (int i = 0; i < 5; ++i) {
            print(8);
            System.out.println();
        }
        for (int i = 0; i < 30; ++i) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < 5; ++i) {
            print(8);
            System.out.println();
        }
    }
}
