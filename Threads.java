package examen_isp_2020;

import java.util.ArrayList;
import java.util.*;

import static java.lang.System.currentTimeMillis;

public class Threads {
        public static void main(String[] args) {
            LThread LThread1 = new LThread("LThread1 ");
            LThread LThread2 = new LThread("LThread2 ");
            LThread LThread3 = new LThread("LThread3 ");

            LThread1.start();
            LThread2.start();
            LThread3.start();
        }
    }

    class LThread extends Thread {
        private String name;

        LThread(String name) {
            this.name = name;
        }
        @Override
        public void run() {
            for (int i = 1; i <= 7; i++) {
                System.out.println(name +" "+ currentTimeMillis() +" "+ " - "  + i);
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Error");
                }
            }
        }
    }