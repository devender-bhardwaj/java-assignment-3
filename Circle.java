class Circle {
    public static void printSpace(int x) {
        for (int i = 0; i < x; ++i) {
            System.out.print(" ");
        }
    }
    public static void printStar() {
        System.out.print("*");
    }
    public static void main(String[] args) {
        for (double i = 0;  i < 12; ++i) {
            
                printSpace(6 - (int) (6 * Math.sin(  15d*i*Math.PI/180d ))   );
                printStar();
                printSpace(2 * (int) (6 * Math.sin(  15d*i*Math.PI/180d )));
                printStar();

            System.out.println();
        }
    }
}