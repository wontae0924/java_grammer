import java.util.Scanner;

public class C04IfStatement {
    public static void main(String[] args) {
/*//        비밀번호는 1234 이고 스캐너를 써서 사용자의 input int로 받아서 만약에 비밀번호와 사용자의 input 일치하면 문이 열렸습니다.
//        일치하지 않으면 비밀번호가 틀렸습니다. 출력
        String a = "1234";
        Scanner myScan = new Scanner(System.in);
        System.out.println("비밀번호를 입력하시오");
        String inputs =  myScan.nextLine();
        if(a.equals(inputs)){
            System.out.println("문이 열리네요~ 그대가 들어오죠~");
        }else {
            System.out.println("비밀번호 불일치");
        }*/
/*//        묵시적 타입변환
//        a : 97 , A : 65
//        사용자한테 알파벳을 아무거나 입력받고, 그 알파벳이 대분자인지 소문자인지 반펼
        Scanner myScan = new Scanner(System.in);
        System.out.println("알파벳 한개 입력 : ");
         char a = myScan.nextLine().charAt(0);

        if ( a >= 'a' && a <= 'z'){
            System.out.println("소문자");
        }else if( a >= 'A' && a <= 'Z') {
            System.out.println("대문자");
        }else {
            System.out.println("알파벳이 아닙니다.");
        }*/
/*//        버스카드 예제
//        내 돈이 얼마 있는지 입력
//        버스 요금 1500이고 돈이 적으면 탑승불가, 돈이 더 많으면 정상처리 출력.
//        도난여부 boolean
        Scanner myScan = new Scanner(System.in);
        int bus = 1500;
        boolean inStolen = false;
        System.out.println("현재 가지고 있는 돈을 입력하시오");
        int myMoney = myScan.nextInt();
        if (myMoney >= 1500 && inStolen == false){
            System.out.println("정상 탑승입니다");
        }else {
            System.out.println("탑승 불가능");
        }*/

/*//        삼항연산자 도어락키if문 문제를 삼항연산자로 변환
        String a = "1234";
        Scanner myScan = new Scanner(System.in);
        System.out.println("비밀번호를 입력하시오");
        String inputs =  myScan.nextLine();
        String rusult = a.equals(inputs) ? "비밀번호 일치" : "비밀번호 불일치";
        System.out.println(rusult);*/

/*//        else if
        Scanner myScan = new Scanner(System.in);
        System.out.println("현재 당신이 가지고 있는 돈을 입력하시오");
        int myMoney = myScan.nextInt();
        if (myMoney >= 10000){
            System.out.println("택시타고 가세요");
        } else if (myMoney >= 3000 ) {
            System.out.println("버스타고 가세요");
        } else if (myMoney >= 2000  ) {
            System.out.println("킥보드타고 가세요");
        }else {
            System.out.println("걸어가세요 ㅠㅠ");
        }*/
//*


    }
}
