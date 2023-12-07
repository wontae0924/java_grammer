import java.math.BigDecimal;

public class C02Variable {
    public static void main(String[] args) {
        //    실습 바이트
       /* byte num1 = 127;
        byte num2 = -128;
        num1++;
        num2--;
        System.out.println(num1);
        System.out.println(num1);*/
/*//        실수 : float, double(기본)
        float f1 = 1.123456789f;
        double b1 = 1.123456789;
        System.out.println("f1 : " + f1);
        System.out.println("b1 : " + b1);*/

//        부동소수점 오차 테스트
//        double double_num = 0.1;
//        미세오차는 조정되어 정상적으로 출력
//        System.out.println(double_num);
//        반복적인 연산시 오차가 확대되어 오차확인가능
/*        double double_num = 0;
        for (int i=0;i<1000;i++){
            double_num = double_num + 0.1*10 ;
        }
        double_num = double_num/10;
        System.out.println(double_num);*/

       /* double d1 =1.03;
        double d2 =0.42;
        System.out.println(d1-d2);
//        저장할때는 문자열 -> 연산할때는 정수로 변환 -> 최종 결과는 실수로 변환
        BigDecimal mybig1 = new BigDecimal("1.03");
        BigDecimal mybig2 = new BigDecimal("0.42");
        double result = mybig1.subtract(mybig2).doubleValue();
        System.out.println(result);
        System.out.println(mybig1.subtract(mybig2));*/

/*//        문자 : char
        char my_char = '가';
        System.out.println(my_char);   */

// boolean : true(1) or false(0)
/*        boolean my_bool = true;
        System.out.println(my_bool);
        if (my_bool){
            System.out.println("조건식이 참이야");
        }
        int bool_num1 = 20;
        int bool_num2 = 10;
        if (bool_num1 > bool_num2){
            System.out.println("조건식이 참이야");
        }*/
/*//        묵시적 타입 변환
        char ch1 = 'a';
        int ch1_num = ch1;
        System.out.println(ch1_num);
        int my_int1 = 10;
        double my_double = my_int1;
//        int my_int1 =  my_double; 할경우에러에러
//        대신  my_int1 =  (int)my_double; 이런식으로 하면 가능하지만 데이터 손실 남
        System.out.println(my_double);
        double mydouble2 = 7.2f;
        System.out.println(mydouble2);
//        명시적 타입변환
        char my_char2 = 'b';
        int char_num = (int) my_char2;*/
/*
//        int a가 1 int b가 4일때 둘을 나눈 값을 int에 담아 출력, double에 담아 출력
        int a = 1;
        int b = 4;
        int a_int = a/b;
        double b_double = a/b;
        System.out.println(a_int);
        System.out.println(b_double);
        double d2 = (double) a/(double) b;
        System.out.println(d2);*/

//        변수와 상수
//        선언과 동시에 초기화
        int a1 = 10;
        a1 = 20;
        int a2; //지역변수는 선언만 됐을때는 값이 0으로 초기화되지 않으나, 객체로 선언될떄는 0으로 초기화
        a2 =20;
//        객체로 만들때는 0으로 초기화
        int [] arr = new int[5];
        System.out.println(arr[0]);
//        상수는 값의 재할당이 불가능
        final int ages = 20;
//        상수는 값의 변경이 불가능 -> ages = 30; 에러발생
//        상수는 선언만 한 뒤에 나중에 초기화 하는 방식이 java8이전에는 안됐었지만 이후 가능해짐
 };
}


