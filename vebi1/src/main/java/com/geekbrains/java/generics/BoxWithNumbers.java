package com.geekbrains.java.generics;

import java.io.Serializable;
import java.util.Arrays;

public class BoxWithNumbers<N extends Number & Serializable> {
    private N[] numbers;

    public N[] getNumbers() {
        return numbers;
    }

    public BoxWithNumbers(N... numbers) {
        this.numbers = numbers;
    }

    public double avg() {
        double res = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            res += numbers[i].doubleValue();
        }
        return res / numbers.length;
    }

/* BoxWithNumbers 2 */
    public boolean equalsByAvg(BoxWithNumbers<?> another) {
//        return this.avg() == another.avg();
        return Math.abs(this.avg() - another.avg()) < 0.0001;
    }
}