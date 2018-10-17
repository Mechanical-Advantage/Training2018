public class LargestOfThreeMethod {

    public static int find_greatest(int x1, int x2, int x3) {
        int largest = 0;

        // let's print the three numbers for comparision puruposes
        System.out.println("Nums " + x1 + " " + x2 + " " + x3);

        if (x1 >= x2 & x1 >= x3) {
            largest = x1;
            System.out.println("Biggest is x1\n");
        } else if (x2 >= x1 & x2 >= x3) {
            largest = x2;
            System.out.println("Biggest is x2\n");
        } else if (x3 >= x1 & x3 >= x2) {
            largest = x3;
            System.out.println("Biggest is x3\n");
        }

        // finally we return the largest number
        return largest;
    }

    // This is our main function that will be run at startup
    public static void main(String[] args) {
        int result;
        // this should 
        result = find_greatest(100, 200, 1);
        result = find_greatest(300, 200, 1);
        result = find_greatest(100, 200, 300);
        result = find_greatest(1, 200, 200);
        result = find_greatest(0, 0, 0);
    }

}
