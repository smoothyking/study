package org.example;

public class ex1 {
    // 1. Error
   // final double CONST_1;

    // OK
    final double CONST_2 = 2.22;
    // 멤버 변수로 들어간다. 한번에 선언해야만 한다. (두줄 x )


    // 2. Error
    //final double CONST_3;
    //CONST_3 = 3.33;

    // OK
    final double CONST_4;
    public ex1() {
        this.CONST_4 = 4.44;
    }

    public void test() {
        // OK
       //final double CONST_5;
        //System.out.println("Final CONST_5 : "+ CONST_5); // 3. ERROR


        // OK
        final double CONST_6;
        CONST_6 = 6.66;
        System.out.println("Final CONST_6 : "+ CONST_6);
        // test라는 메서드 안에 있기 때문에 지역 변수이다. 지역변수일때는 두줄 선언 가능하다.
    }

    public static void main(String[] args) {
        ex1 constant = new ex1();
        System.out.println("Final CONST_2 : "+ constant.CONST_2);
        System.out.println("Final CONST_4 : "+ constant.CONST_4);
        constant.test();
    }
}


//생성자를 써서 초기화를 하거나, 메서드 안에서 선언을 하면 두줄 괜찮다.
//값을 넘겨줄때,