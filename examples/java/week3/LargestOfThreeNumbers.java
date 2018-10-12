/* * 
First Java program, which says "Hello, world!" 
*/
public class LargestOfThreeNumbers {

    // Print the greatest value
    public static void main(String[] args) {
        // Think about what happens if these values are the same
        // What happens if num1 and num2 are the same, and num3 is different ... and
        // other combinations of this regard
        // Somethings to think about:
        // - What if these are decimal points
        // - what would you have to do if I want to find the greatest of 10 numbers
        // (Scalability)
        int num1 = 300;
        int num2 = 200;
        int num3 = 400; // greatest value

        if (num3 > num2) {
            System.out.println("num3 is the greatest!");
        } else if (num1 > num3) {
            System.out.println("num1 is the greatest!");
        } else if (num2 > num1) {
            System.out.println("num2 is the greatest!");
        }
    }
}
