public class FarmRunner {
    public static void main(String[] args) throws Exception {
        Turkey bird = new Turkey();
        Pig pig = new Pig();

        bird.speak();
        bird.sayName();
        pig.speak();
        bird.speak();
        bird.sayName();
        bird.speak();
        pig.speak();
        bird.sayName();
        bird.speak();
        pig.speak();
    }
}
