class Extend extends Parent {
    /**
     * Extends the Parent and increment the speed by 10
     * 
     * @return new speed of the tiger
     */

    public static int speed_of_tiger() {
        Parent speed_of_tiger = new Parent();
        int new_speed = speed_of_tiger.speed() + 10;
        System.out.println(new_speed);
        return new_speed;

    }

    public static void main(String[] args) {
        speed_of_tiger();
    }

}