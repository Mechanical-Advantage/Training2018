class MinofTwoNumber {
    /**
     * Class return the minimum of two numbers
     * 
     * @param a int
     * @param b int
     * @return small of the two numbers
     */

    public static int min_two_num(int a, int b) {
        int min_num;
        if (a < b) {
            min_num = a;
        } else {
            min_num = b;
        }
        System.out.println(min_num);
        return min_num;
    }

    public static double min_two_num(double a, double b) {
        double min_num;
        if (a < b) {
            min_num = a;
        } else {
            min_num = b;
        }
        System.out.println(min_num);
        return min_num;
    }

    public static void main(String[] args) {
        min_two_num(2, 3);
        min_two_num(3.1, 1.0);
    }
}