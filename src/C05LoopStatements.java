import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {
      /*  //        while 문 조건식이 참인동안만 반복적으로 실행
//        2부터 10까지 출력하는 while문 예제
        int a = 0;
        while (a <= 10){
            if (a >= 2 && a <= 10){
                System.out.println(a);
            }
            a++;
        }*/

/*//        while문 구구단
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단을 입력하세요");
        int input = sc.nextInt();

        int a = 1;
        while (a < 10){
            System.out.println(input + "X" +  a + "=" + input*a);
            a++;
        }*/
/*//        도어락 while문 break 변환 예제
        String a = "0234";
        Scanner myScan = new Scanner(System.in);
        int b = 1;
        while (b <= 6){
            System.out.println("비밀번호를 입력하시오");
            String inputs =  myScan.nextLine();
            if (a.equals(inputs)){
                System.out.println("문이 열리네요");
                break;
            } else if(b<=5){
                System.out.println(b + "회 오류");
                b++;
            } else{
                System.out.println("입력횟수가 초과되었습니다.");
                break;
            }
        }*/

/*//        do while 문
//        2부터 10까지 출력하는 do while문 예제
        int a = 2;
        do {
                System.out.println(a);
                a++;
        } while (a <= 10);*/

/*//        for문을 통해 2~10까지 출력
        for (int i = 2;i <= 10;i++ ){
            System.out.println(i);
        }*/
/*//        continue를 사용해서 홀수만 출력되도록
        for (int i = 0;i < 10;i++ ){
            if (i%2 == 0){
                continue;
            }
            System.out.println(i);
        }*/

//        라벨물
        loop1:
        for (int i=0 ; i < 5 ; i++){
            loop2:
            for (int j =0; j <5; j++){
                System.out.println("헬로 월드");
                if (j == 2) {
                    break loop1;
                }
            }
        }



    }
}
