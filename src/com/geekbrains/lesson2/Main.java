package com.geekbrains.lesson2;

public class Main {

    public static void main(String[] args)  {
        try {
            someMethod();
//            int[] array = {1, 2, 3};
//            System.out.println(array[4]);
        } catch (NullPointerException exception) {
            System.out.println("Поймали ошибку");
            System.out.println(exception.getMessage());
        } catch (DivideByZeroException e) {
            e.printStackTrace();
        }
        System.out.println("Выполнение программы окончено");
    }

    private static void someMethod() throws DivideByZeroException {
        int a = 0;
        int b = divide(a);
        System.out.println("Это сообщение не будет выведено в консоль");
    }

    private static int divide(int a) throws DivideByZeroException {
        if (a == 0) {
            throw new DivideByZeroException();
        }
        System.out.println("Должно вывести в консоль после проброса исключения!!!");
        return 10 / a;
    }

}
