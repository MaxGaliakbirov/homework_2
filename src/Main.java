public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
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

    public static void task2() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
    }

    public static void task3() {
        System.out.println("Задача 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println(totalWeight);
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println(weightDifference);
        System.out.println("Задача 7");
        weightDifference = secondBoxer - firstBoxer;
        System.out.println(weightDifference);
        weightDifference = secondBoxer % firstBoxer;
        System.out.println(weightDifference);
        System.out.println("Задача 8");
        var totalHours = 640;
        var timePerEmployee = 8;
        var totalEmployee = totalHours / timePerEmployee;
        System.out.println("Всего работников в компании - " + totalEmployee + " человек" );
        var additionalEmployees = totalEmployee + 94;
        var totalAdditionalHours = additionalEmployees * 8;
        System.out.println("Если в компании работает " + additionalEmployees + " человека, то всего " +
                totalAdditionalHours + " часов работы может быть поделено между сотрудниками");
    }
}