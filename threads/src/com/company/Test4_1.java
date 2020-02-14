package com.company;

/*
    Вот можно ещё так. И это более правильно
    Но ещё более правильно чтобы вы у переменной lock указали модификатор final чтобы не лохануться как это сделал я на занятии
 */
public class Test4_1 {
    private static Integer a = 0;
    private static final Object lock = new Object();

    public static void main(String[] args) {


        Thread t1 = new Thread(new Increment());

        Thread t2 = new Thread(new Decrement());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(a);
    }
    public static class Increment implements Runnable{
        @Override
        public void run() {
            synchronized (Test4_1.class) {
                for (int i = 0; i < 10000; i++) {
                    a += 1;
                }
            }
        }
    }

    public  static class Decrement implements Runnable{
        @Override
        public void run() {
            synchronized (Test4_1.class) {
                for (int i = 0; i < 10000; i++) {
                    a -= 1;
                }
            }
        }
    }
}

