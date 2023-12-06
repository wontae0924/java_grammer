public class C03Operator {
    public static void main(String[] args) {
/*//       산술 연산자
        int num1=8 , num2 = 3;
//        * 곱하기 , /나눗셈 , %나머지
        System.out.println("num1 + num2 = " + (num1+num2));
        System.out.println("num1 - num2 = " + (num1-num2));
        System.out.println("num1 * num2 = " + (num1*num2));
        System.out.println("num1 / num2 = " + (num1/(double)num2));
        System.out.println("num1 % num2 = " + (num1%num2));*/
/*//        대입 연산자
        int n1=7,n2=7,n3=7;
        n1 = n1-3;
        n2 -= 3;
        n3 = -3;
        System.out.println(n1 +" and "+ n2+" and " + n3);
//        /= , %=
        int n4 =10 , n5 = 10;
        n4 /= 3;
        n5 %= 3;
        System.out.println(n4 + " and " + n5);*/
/*//        증감 연산자
        int a = 5;
        int b = a++;//        후위 증감 연산자 i++ 실행문이 끝나고 증감
        System.out.println(a);
        System.out.println(b);

         a = 5;
        int c = ++a;//        전위 증감 연산자 ++i 실행문이 끝나기 전 증감
        System.out.println(a);
        System.out.println(c);*/
/*//        실습 비교 연산자
        char num = 'a' , num2 = 'A';
        System.out.println(num == num2);
        System.out.println(num != num2);*/
/*
//        논리연산자 : &&, || ,!
        int num1 = 10 , num2 = 20;
        boolean result1,result2;
//        result1에 num1이 5보다 큰지 조건과 num1 20보다 작은지 조건 and조건을 통해 bool 담기
//        result2에 num2가 10보다 작은 조건과 num2 가 30보다 작은 조건을 or 조건을 통해 boll담기
//        result1,result2 각각 출력 result2에 !달아서 출력
        result1 =(num1 > 5) && (num1 < 20);
        result2 = (num2 < 10)  || (num2 < 30);
        System.out.println(result1);
        System.out.println(!(result2));
*/
 /*       // 0000101 // 0000110
        int n1 = 5; int n2 = 6;
//        비트연산자 &, 각자리의 수가 모두 1일경우만 1
        System.out.println(n1 & n2);
//        비트연산자 |, 각자리의 수가 하나라도 1일경우 1
        System.out.println(n1 | n2);
//        비트연산자 ^, 각자리의 수가 일치 안할 경우 1
        System.out.println(n1 ^ n2);
//        비트연산자 ~,  각자리 수에 반대로 변환
        System.out.println(~ n2);
//        시프트연산자 : << , >> => 곱셈과 나눗셈의 효과 발생
        System.out.println(n1 << 1);*/

      /*  int a = 13; // 00001101
        int b = 9; //  00001001
        while (b!=0){
            int same_index = a & b; //and연산으로 구한 carry 생성
            a = a ^ b; // XOR연산으로 구한  비트값 a에 할당
            b = same_index << 1;
        }
//        1회차 sameindex : 1001 ,a : 00100 , b : 10010
//        a : 10110
        System.out.println(a);*/
    }
}
