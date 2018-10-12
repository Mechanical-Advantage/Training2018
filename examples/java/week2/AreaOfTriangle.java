class AreaOfTriangle {

    // Computes the area of the triangle
    public static void main(String[] args) {
        // This is using float
        double h = 10.5;
        float w = (float) 4.99999999999999999999;
        float area = (float) (h * w) / 2;
        System.out.println(area);

        // This is using double
        double h_1 = 10.5;
        double w_1 = (float) 4.99999999999999999999;
        double area_1 = (float) (h * w) / 2;
        System.out.println(area_1);

        // Essentially both of these outputs are the same since floats and double work
        // the same for any values under 32 bits,
        // Once over this mark, float will complain saying it can't hold these values.
    }
}