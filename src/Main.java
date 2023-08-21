public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();/*
        task4();
        task5();
        task6();
        task7();
        task8();*/
    }

    public static void task1() {
        System.out.println("Task 1");
        int[] numbersOne = new int[3];
        numbersOne[0] = 1;
        numbersOne[1] = 2;
        numbersOne[2] = 3;
        float[] numbersTwo = {1.57f, 7.654f, 9.986f};
        String[] abc = {"a", "b", "c", "d", "f" };
        System.out.println();
    }

    public static void task2() {
        System.out.println("Task 2");
        int[] numbersOne = new int[3];
        numbersOne[0] = 1;
        numbersOne[1] = 2;
        numbersOne[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.print(numbersOne[i]);
            if (i < 2) {
                System.out.print(", ");
            } else System.out.println();
        }
        float[] numbersTwo = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < 3; i++) {
            System.out.print(numbersTwo[i]);
            if (i < 2) {
                System.out.print(", ");
            } else System.out.println();
        }
        String[] abc = {"a", "b", "c", "d", "e" };
        for (int i = 0; i < abc.length; i++) {
            System.out.print(abc[i]);
            if (i < (abc.length - 1)) { // убираем запятую после последнего элемента массива
                System.out.print(", ");
            } else System.out.println();
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Task 3");
        int[] numbersOne = new int[3];
        numbersOne[0] = 1;
        numbersOne[1] = 2;
        numbersOne[2] = 3;
        for (int i = 2; i >= 0; i--) {
            System.out.print(numbersOne[i]);
            if (i > 0) {
                System.out.print(", ");
            } else System.out.println();
        }
        float[] numbersTwo = {1.57f, 7.654f, 9.986f};
        for (int i = 2; i >= 0; i--) {
            System.out.print(numbersTwo[i]);
            if (i > 0) {
                System.out.print(", ");
            } else System.out.println();
        }
        String[] abc = {"a", "b", "c", "d", "e" };
        for (int i = (abc.length - 1); i >= 0; i--) {
            System.out.print(abc[i]);
            if (i > 0) {
                System.out.print(", ");
            } else System.out.println();
        }
        System.out.println();
    }
}