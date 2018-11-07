public enum Animal {
    // Enum for the Animals defined
    Giraffe(20), Monkey(2), Liger(9000), WoolyMammoth(1), Wookie(100);

    private int speed;

    Animal(int speed) {
        this.speed = speed;
    }

    // Gets the Speed of each animal
    public int getAnimalSpeed() {
        return this.speed;
    }
}

// enum Animal {
// Giraffe, Monkey, Liger, WoolyMammoth, Wookie;
// }