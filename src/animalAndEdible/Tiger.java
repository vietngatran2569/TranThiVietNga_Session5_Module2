package animalAndEdible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Tiger: roarrr!";
    }

    @Override
    public String howToEat() {
        return "like fresh meat";
    }
}
