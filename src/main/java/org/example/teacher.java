/*
    회사마다 사람마다 말할 때마다 다르게 말하는 경우가 있으니 한번 읽어둘 것.
    기억나는 대로 정리했으니 잘못된 부분 있으면 공유~! 수정~! 해주세요!


package org.example; // 폴더(디렉토리) 경로

    public class teacher { // 파일명
        // 멤버 변수, 필드
        private int a = 1; // 멤버 변수
        private int b = 1; // 멤버 변수
        private static int c = 1; // 멤버 변수, 정적 변수, 클래스 변수
        private final int d = 1; // 멤버 변수, 인스턴스 상수

        public static int e = 1; // ≒ 전역 변수
        public static final int f = 1; // ≒ 전역 상수


        접근 제어자 : public > protected > default > private


    public teacher(){ // 생성자 메서드

    }

        // int -> 반환 유형
    public int 더하기(int a, int b) { // 멤버 메서드, 함수, 기능
        int aa = 1; // 지역 변수
        final int ab = 1; // 지역 상수
        System.out.println(a + b);
        return aa; // 반환값, return값
    }
        // void -> 반환 유형
    public void 빼기(int a, int b) { // 멤버 메서드, 함수, 기능
        System.out.println(a + b);
    }


    public static void main(String[] args) { // 메인 메서드(프로그램 실행의 시작점)
        Study study; // 객체 참조 변수 선언
        study = new Study(); // 객체 생성, 인스턴스 생성
        study.더하기(study.a, study.b); // 메서드 호출(파라메터)
        System.out.println("AAAAaaa"); // Console 출력
    }

    */