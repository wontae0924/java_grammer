import java.util.Scanner;

public class C05LoopPractice {
    public static void main(String[] args) {
/*//        짝수의 합 계산하기`
//        1~20까지의 짝수의 합 출력
        int a = 0;
        for (int i = 1; i <= 20 ;i++){
            if (i % 2 == 0){
                a = a + i;
            }
        }
        System.out.println("짝수의 총합 : " + a);*/

/*//        1234 일 경우 -> 4321 이런식으로 하기
        int num = 1234;
        int result = 0;
        int a = 0;
        int i = 10;
        while (true){
              a = num % 10;
              result = result * 10 + a;
            num = num / 10;
              if (num == 0){
                  break;
              }
        }
        System.out.println(result);*/

/*//        최대 공약수
        int a = 24 , b = 36;
        int c = a < b ? a : b;
        int answer = 0;
        for (int i = 1; i < c ;i++){
            if(b % i ==0){
                if(a % i == 0){
                    answer = i;
                }
            }

        }
        System.out.println(answer);*/

/*//        라벨문 활용1
//        target이 matrix에 i,j번쨰 배열에 있는지 출력
//        target을 찾으면 반복문 전체 종료
//        순차적으로 조회후에 label써서 첫번째for문 종료
        int[][] matrix = {{1,2,3,4},{5,6,7},{8,9},{10,11,12,13,14}};
        int target = 11;
        loop1:
        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length;j++){
                if (matrix[i][j] == target){
                    System.out.println("타켓은"+ i +","+ j+ "있습니다.");
                    break loop1;
                }
            }
        }*/

//        1~20 숫자가 있을때 이 중에 약수가 5개 이상인 숫자 중에 가장 작은값을 구하시오
//        불필요한 추가 반봇 X -> 라벨문
        int count = 0;
        lp1:
        for (int i = 1; i <= 20 ; i++){
            for (int j = 1; j <= i; j++){
                if (i % j ==0){
                    count ++;
                }
                if(count == 5){
                    System.out.println("약수가 다섯개인 이상인 숫자 중 가장 작은 값 : " + i);
                    break lp1;
                }
            }
            count = 0;
        }
    }
}
