public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bob", 5, 3.0);
        cat1.introduce();
        cat1.printCatInfo();
        Cat cat2 = new Cat("bingus", 59, 1.0);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
