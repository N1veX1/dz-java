public class dz {

    static String dogname;
    static String dogbreed;
    static int dogage;

    static String catname;
    static String catcolor;
    static int catage;

    public static void main(String[] args) {
        System.out.println("старт программы");

        createdog("шарик", "овчарка", 3);
        createcat("мурка", "трёхцветная", 2);

        System.out.println();

        dogspeak();
        catspeak();

        System.out.println();

        printpetinfo();

        System.out.println("конец программы");
    }

    public static void createdog(String name, String breed, int age) {
        System.out.println("[система]: вызвана функция createdog(). создаем собаку");
        dogname = name;
        dogbreed = breed;
        dogage = age;
    }

    public static void createcat(String name, String color, int age) {
        System.out.println("[система]: вызвана функция createcat(). создаем кошку");
        catname = name;
        catcolor = color;
        catage = age;
    }

    public static void dogspeak() {
        System.out.println("[система]: вызвана функция dogspeak(). собака лает");
        System.out.println(dogname + " говорит: гав-гав");
    }

    public static void catspeak() {
        System.out.println("[система]: вызвана функция catspeak(). кошка мяукает");
        System.out.println(catname + " говорит: мяу-мяу");
    }

    public static void printpetinfo() {
        System.out.println("[система]: вызвана функция printpetinfo(). выводим данные в консоль:");
        System.out.println("информация о собаке");
        System.out.println("кличка: " + dogname);
        System.out.println("порода: " + dogbreed);
        System.out.println("возраст: " + dogage + " года/лет");
        
        System.out.println("информация о кошке");
        System.out.println("кличка: " + catname);
        System.out.println("цвет: " + catcolor);
        System.out.println("возраст: " + catage + " года/лет");
    }
}
