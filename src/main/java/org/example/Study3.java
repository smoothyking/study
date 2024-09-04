package org.example;
import java.util.Scanner;

public class Study3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이 입력");
        int age = sc.nextInt();
        if (age < 19) {
            System.out.println("청소년");
        } else if (age < 13) {
            System.out.println("어린이");
        } else {
            System.out.println("성인");
        }

        System.out.println("등급 입력");
        char memberGrade = sc.next().charAt(0);
        switch (memberGrade) {

            case 'A':
                System.out.println("우수 회원");
                break;
            case 'B':
                System.out.println("정회원");
                break;
            case 'C':
                System.out.println("그냥회원");
                break;
        }
    }
}