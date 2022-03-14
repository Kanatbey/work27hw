package com.company;

import java.util.ArrayList;

public class Box<D> {
    private D run;

    public Box(D run) {
        this.run = run;
    }

    public Box() {
    }

    public D getRun() {
        return run;
    }

    public void setRun(D run) {
        this.run = run;
    }

    public static void generic(ArrayList<?> san) {

        for (Object o : san) {
            System.out.println(o);
        }
        System.out.println(san);
    }

    @Override
    public String toString() {
        return  "\nRun : " + run;
    }
}
//    Box деген generic класс тузунуз.
//        Ичинде Box деген объектти кайтарган статический generic метод болсун.