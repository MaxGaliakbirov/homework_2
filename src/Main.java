public class Main {

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Переменные");
        System.out.println("Задача 1");
        int dog = 8;
        double cat = 3.6;
        int paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача 2");
        dog += 4;
        cat += 4.0;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача 3");
        dog -= 3;
        dog -= 5;
        --cat;
        cat -= 6.0;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
}