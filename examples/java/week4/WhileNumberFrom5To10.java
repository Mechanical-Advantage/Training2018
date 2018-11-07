class WhileNumberfrom5To10 {
    // Prints the numbers from 5 - 10 inclusive
    // If < was used, the number 10 would be exclusive, thus print number from 5 - 9
    public static void main(String args[]) {
        int a = 5;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }
    }
}