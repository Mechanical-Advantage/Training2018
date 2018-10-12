class LocalvsStatic {

    static String hello = "Hello";

    static void something1() {
        hello = "World!";
        System.out.println(hello);
        // final int five = 5;
        // This will throw an exception
        // you never want to change a variable value once it is declared as final
        // five = 6;
    }

    // static variable acting on the method
    // this will output World! twice
    public static void main(String[] args) {
        hello = "new Static variable value";
        something1();
        System.out.println(hello);
    }

}