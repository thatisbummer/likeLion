package likeLionTestQ.inheritance.Q1;

public class AnimalManager {
    public static void main(String[] args) {
        Animal dog = new Dog("강아지");
        Animal cat = new Cat("고양이");

        dog.makeSound();
        cat.makeSound();

        Animal[] animal = new Animal[2];

        animal[0] = new Dog("강아지");
        animal[1] = new Cat("고양이");

        for(Animal animals : animal) {
            System.out.print(animals.getName() + " : ");
            animals.makeSound();
        }
    }
}
