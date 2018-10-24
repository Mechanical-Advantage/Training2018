import Animal;

class AnimalSpeed {

    public static void main(String[] args) {
        for (Animal an : Animal.values()) {
            System.out.println(an + " " + an.getAnimalSpeed());
        }
    }

}

// enum Week {
// Monday(1), Tuesday(2), Wednesday(3), Thursday(4), Friday(5), Saturaday(6),
// Sunday(7);

// private int speed;

// Level(int speed) {
// this.speed = speed;
// }

// public int getAnimalSpeed() {
// return this.speed;
// }
// }

// public class AnimalSpeed {
// public static void main(String args[]) {
// System.out.println("Here are all Week constants");

// // use values()
// Week allWeek[] = Week.values();
// for (Week aday : allWeek) {
// System.out.println(aday);
// }

// }
// }