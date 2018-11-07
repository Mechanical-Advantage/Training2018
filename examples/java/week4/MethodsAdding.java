// Program to illustrate methodsin java 

class MethodsAdding {

    public int addTwoInt(int a, int b) {
        int sum = 0;

        // adding two integer value.
        sum = a + b;

        // returning summation of two values.
        return sum;
    }

    public double addTwoInt(double a, double b) {
        double sum = 0.0;
        sum = a + b;

        return sum;
    }

}

class GFG {
    public static void main(String[] args) {

        // creating an instance of Addition class
        MethodsAdding add = new MethodsAdding();

        // calling addTwoInt() method to add two integer using instance created
        // in above step.
        int s = add.addTwoInt(1, 2);
        double d = add.addTwoInt(3.0, 4.0);
        System.out.println("INT: Sum of two integer values: " + s);
        System.out.println("DOUBLE: Sum of two integer values: " + d);

    }
}