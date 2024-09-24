package U1T1_OBJECTS;
public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Dog", 3, 20);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Bear", 7, 18.8);
        cat2.printCatInfo();
        cat2.introduce();

    }
}
