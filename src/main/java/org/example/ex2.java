package org.example;
    public class ex2 {
        public static void main(String[] args) {
            int intT = 1; // 1.1 이렇게 넣으면 오류.
            System.out.println(intT);

            double doubleT = 2.2; // 2 이렇게만 넣어도 2.0으로 출력.
            System.out.println(doubleT);

            char charT = 'c'; // '' 이렇게 비워두거나, 'cc' 두자 이상 넣으면 오류.
            System.out.println(charT);

            String stringT = "ddd~~!"; // char는 ', Stirng은 “
            System.out.println(stringT);
            // 참고: ' 는 싱글쿼테이션, 싱글퀘테이션, 홑따옴표, 작은따옴표 라고 말함.
            // 참고: " 는 더블쿼테이션, 더블퀘테이션, 쌍따옴표, 큰따옴표   라고 말함.

            boolean booleanT = true; // true, false 외에 넣을 수 없음.
            System.out.println(booleanT);
        }
    }
