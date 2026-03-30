//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Задача 1");
    int age = 18;
    if (age >= 18) {
        System.out.println("Если возраст человека равен " + age + " он совершеннолетний.");
    } else {
        System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия.");
    }

    System.out.println("Задача 2");
    int temperature = 4;
    if (temperature <= 5) {
        System.out.println("На улице " + temperature + " градусов. Нужно надеть шапку.");
    } else {
        System.out.println("На улице " + temperature + " градусов. Можно идти без шапки.");
    }

    System.out.println("Задача 3");
    int speed = 61;
    if (speed <= 60) {
        System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
    } else {
        System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
    }

    System.out.println("Задача 4");
    age = 18;
    if (age >= 2 && age <= 6) {
        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
    }
    if (age >= 7 && age <= 17) {
        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
    }
    if (age >= 18 && age <= 24) {
        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
    }
    if (age > 24) {
        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
    }

    System.out.println("Задача 5");
    int childAge = 8;
    if (childAge <= 5) {
        System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе.");
    }
    if (childAge > 5 && childAge <= 14) {
        System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься только в сопровождении взрослого.");
    }
    if (childAge > 14) {
        System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься без сопровождения взрослого.");
    }

    System.out.println("Задача 6");
    int trainCarCapacity = 102;
    int seatingCount = 60;
    int passengers = 78;

    if (passengers >= trainCarCapacity) {
        System.out.println("В вагоне нет свободных мест.");
    } else {
        if (passengers < seatingCount) {
            System.out.println("В вагоне есть сидячие места.");
        } else {
            System.out.println("В вагоне осатлись только стоячие места.");
        }
    }

    System.out.println("Задача 7");
    int one = 4;
    int two = 2;
    int three = 10;

    if (one > two) {
        if (one > three) {
            System.out.println("Наибольшее число: " + one);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    } else {
        if (two > three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }
}
