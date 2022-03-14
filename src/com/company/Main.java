package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Box> san = new ArrayList<>(List.of(new Box(23),
                new Box<>("Akylbek"),
                new Box<>("Aisha"),
                new Box<>(Math.PI),
                new Box<>('?'),
                new Box<>(false)
        ));

        Box.generic(san);
    }
}
