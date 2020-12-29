package lec08.thread02.elevnth;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedThreadMain {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();

        Thread thread1 = new Thread() {
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        break;
                    }

                    synchronized (intList) {
                        if (intList.size() > 0) {
                            intList.remove(intList.size() - 1);
                        }
                    }

                }
            }
        };

        Thread thread2 = new Thread() {
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        break;
                    }

                    synchronized (intList) {
                        if (intList.size() > 0) {
                            System.out.println(intList);
                            System.out.println("List의 마지막 값 : " + intList.get(intList.size() - 1));
                        }
                    }
                }
            }
        };

        Thread thread3 = new Thread() {
            public void run() {
                int count = 0;
                while (true) {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        break;
                    }

                    synchronized (intList) {
                        intList.add(count);
                    }

                    count++;
                    boolean alive1 = thread1.isAlive();
                    boolean alive2 = thread2.isAlive();

                    if (alive1 == false || alive2 == false || count == 3000) {
                        thread1.interrupt();
                        thread2.interrupt();
                        interrupt();
                    }
                }
            }
        };

        thread1.start();
        thread2.start();
        thread3.start();

    }

}
