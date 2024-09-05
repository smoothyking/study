package org.example;

public class Study7 {
    public static void main(String[] args) {
        // 배열에 각 라인의 첫 번째 단의 값을 설정
        int[] startDan = {2, 5, 8};

        // 첫 번째 줄, 두 번째 줄, 세 번째 줄을 각각 처리
        for (int line = 0; line < 3; line++) {
            // 1부터 9까지 곱할 값을 반복
            for (int i = 1; i <= 9; i++) {
                // 시작 단부터 시작하여 3개의 단을 출력 (마지막 라인은 2개의 단)
                for (int j = startDan[line]; j < startDan[line] + 3 && j <= 9; j++) {
                    System.out.print(j + " * " + i + " = " + (j * i) + "\t");
                }
                System.out.println(); // 한 줄 끝나면 줄 바꿈
            }
            System.out.println(); // 각 라인 간 간격을 위한 줄 바꿈
        }
    }
}


