package org.example;

public class Study6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            // 열을 2부터 9까지 반복
            for (int j = 2; j <= 9; j++) {
                // 각 단의 곱셈 결과를 출력
                System.out.print(j + " * " + i + " = " + (j * i) + "\t");
            }
            // 한 줄을 출력한 후 줄 바꿈
            System.out.println();
        }
    }
}


