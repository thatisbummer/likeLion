package likeLionTestQ.inheritance.Q1;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public void makeSound() {
        System.out.println("동물이 소리를 냅니다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

