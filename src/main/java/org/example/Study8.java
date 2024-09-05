package org.example;
import java.util.*;

public class Study8 {
    public static void main(String[] args) {
        int[][] data = {{1, 2, 3}, {4, 5, 6}};

        for (int i = 0; i < data.length; i++) {
            System.out.println("################");
            System.out.println("i=" + i + " -> " + Arrays.toString(data[i]));
            for (int j = 0; j < data[i].length; j++) {
                System.out.println("i=" + i + ",j=" + j + " -> " + data[i][j]);
            }
        }

    }
}


