package com.geekbrains.logger;

import java.util.Arrays;

public class HomeWork {

    public int[] task1(int[] data) {
        for (int i = data.length - 1; i >= 0; i--) {
            if (data[i] == 4) {
                return Arrays.copyOfRange(data, i + 1, data.length);
            }
        }
        throw new RuntimeException("Invalid array");
    }

    public boolean task2 ( int[] data){
        boolean contains1 = false;
        boolean contains4 = false;

        for (int value : data) {
            switch (value) {
                case 1:
                    contains1 = true;
                    break;
                case 4:
                    contains4 = true;
                    break;
                default:
                    return false;
            }
        }
        return contains1 && contains4;
    }
}

