package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String str1 = "four 52 along 96 25 gym root 15 hat 73 bank success 38 46";
        sort(str1);

        System.out.println("------");

        String str2 = "game 45 but 87 17 hook salary 10 image 70 computer table 35 40";
        sort(str2);
        // Что будет находиться на 3-ей позиции на 4-ом шаге?
        // Если считать позиции с нуля, а шаги с единицы, то там будет строка but
    }

    public static void sort(String str) {
        LinkedList<String> arr = new LinkedList<>(new ArrayList<>(Arrays.stream(str.split(" ")).toList()));

        String strMin = "z";
        String intMax = "0";

        for (int i = 0; i < arr.size() / 2; i++) {
            for (int j = i; j < arr.size() - i; j++) {
                if (StringUtils.isNumeric(arr.get(j))) {
                    if (intMax.compareTo(arr.get(j)) < 0) {
                        intMax = arr.get(j);
                    }
                } else {
                    if (strMin.compareTo(arr.get(j)) > 0) {
                        strMin = arr.get(j);
                    }
                }
            }
            arr.remove(intMax);
            arr.add(intMax);

            arr.remove(strMin);
            arr.addFirst(strMin);

            strMin = "z";
            intMax = "0";

            System.out.println(arr);
        }
    }

}