import Animal;
// Prints the Animal Speed and Animal 

class AnimalSpeed {

    public static void main(String[] args) {
        for (Animal an : Animal.values()) {
            System.out.println(an + " " + an.getAnimalSpeed());
        }

        int m_speed = Animal.Monkey.getAnimalSpeed();
        System.out.println("Speed of the monkey is: " + m_speed);
    }
}
