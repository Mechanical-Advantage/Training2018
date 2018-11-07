class CalculateSum {
    // Calculates the sum of the first 100 natural numbers
    public static void main(String[] args) {
        int num = 100;
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
    }
}