import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
/*//        참조자료형 : 기본 자료형을 제외한 모든 자료형
//        Wrapper class : 기본형 타입에 없는 다양한 기능을 지원하기 위한 클래스
//         int와 Interger간의 형변환
        int a = 10;
        Integer b = new Integer(20);
//        오토 언박싱 : Integer -> int 형변환
        int c = b;
//        언박싱 Integer -> int 형변환
        int d = b.intValue();
//        오토 박싱
        Integer e = a;
//        박싱0
        Integer f = Integer.valueOf(a);*/

/*//        String과 Int의 형변환
        int a =10;
        String st_a = Integer.toString(a);//숫자 10을  "10" 문자열로 변환
        String st_a2 = String.valueOf(a);
        int c = Integer.parseInt(st_a);//문자 "10"을 숫자 10로 변환

//        참조자료형에 원시자료형을 담을 떄는 wrapper클래스를 써야한다. ex)컬렉션프레암워크(List,set)
        List<Integer> list_a = new ArrayList<>();
        list_a.add(10);
        list_a.add(20);
        list_a.add(30);
        System.out.println(list_a);*/

        /*String mySt1 = new String("hello");
        String mySt2 = new String("hello");
        String mySt3 = "hello";
        String mySt4 = "hello";
        String mySt5 = mySt1;
        System.out.println(mySt1 == mySt2);
        System.out.println(mySt1 == mySt3);
        System.out.println(mySt4 == mySt3);
        System.out.println("-------------------");
        System.out.println(mySt1.equals(mySt2));
        System.out.println(mySt1.equals(mySt3));
        System.out.println(mySt3.equals(mySt4));
        System.out.println(mySt1.equals(mySt5));*/

/*//        문자열길이 : length();
        String mySt = "hello";
        System.out.println(mySt.length());
        String mySt2 = "hello java";
//        indexOf : 특정 문자열의 위치 변환 , 가장 먼저 나오는 문자열의 위치변환
        int mySt_index = mySt2.indexOf("java");
        System.out.println(mySt_index);
//        contains : 특정 문자열이 있는지 여부를 boolean으로 리턴
        System.out.println(mySt2.contains("hello1"));*/

/*//        charAt : 문자열에서 특정 위치(index)의 문자(char)를 리턴
        String st = "abcdefabcafghghfhaijoihhkhhaadf";
        char myChar = st.charAt(0);
        System.out.println(myChar);
//        charAt, lenght를 활용한 문자a의 개수
        int count = 0;
        for (int i = 0 ; i < st.length() ; i++){
            if (st.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println("a에 갯수는? : " + count);*/

////        subString(a,b) : a이상 b미만의 index를 자른다.
//        String st1 = "hello world";
//        System.out.println(st1.substring(6,st1.length()));
/*        String s = "abcde";
        String answer = "";
        int i = (s.length() / 2);
        if(i % 2 == 0){
             answer = s.substring(i-1,i+1);
        }else if(i % 2 == 1){
             answer = s.substring(i,i+1);
        }
        System.out.println(answer);*/
/*//        공백 제거
        String trimSt = "         hello world     ";
        String new_trimSt = trimSt.trim();
        String stripSt =trimSt.strip();
        System.out.println(new_trimSt);
        System.out.println(stripSt);*/

/*        String a ="Hello";
        String a1 =a.toUpperCase();
        String a2 = a.toLowerCase();
        System.out.println(a1);
        System.out.println(a2);
        a += " world";
        System.out.println(a);*/
//        char -> String 형변환
/*        char ch1 = 'a';
       String st1 = Character.toString(ch1);
        System.out.println(st1);
        String str = "0122abc123한글123";
        String str2 = "";
        for(int i=0; i < str.length();i++){
            char temp = str.charAt(i);
            if ( temp < 'a' || temp > 'z'){
                str2 += Character.toString(temp);
            }
        }
        System.out.println(str2);*/
/*        String my_string ="BCBdbe";
        char letter = 'B';
        String answer = "";
        for(int i=0; i < my_string.length() ;i++){
            char temp = my_string.charAt(i);
            if(temp != letter){
                answer += Character.toString(temp);
            }
        }
        System.out.println(answer);*/
////        replace(a,b) : a문자를 b문자로 대체;
//        String st1 = "hello world";
//        String st2 = st1.replace("world","java");
//        System.out.println(st2);
////        replaceAll(a,b)
//        String st3 = st1.replaceAll("world","python");
//        System.out.println(st3);

 /*       String str = "0122abc123AFFF한글123";
        String str_hangeul = str.replaceAll("[a-z]","");
        System.out.println(str_hangeul);
        String str3 = str.replaceAll("[가-힣]","");
        System.out.println(str3);
        String str4 = str.replaceAll("[0-9]","");
        System.out.println(str4);
        String str5 = str.replaceAll("[A-z0-9]","");
        System.out.println(str5);*/

/*//        Pattern클래스
        boolean matcher = Pattern.matches("[a-z]+","helloworld");
        System.out.println(matcher);
//        전화번호 검증
//        \d :숫자,{}:연속으로
        boolean matcher2 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$","010-2324-5678");
        System.out.println(matcher2);
//        이메일검증
        boolean matcher3 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$","hello@naver.com");
        System.out.println("이메일 인증 :" + matcher3);*/

/*//        split
        String a = "a:b:c:d";
        String[] stArr = a.split(":");
        System.out.println(Arrays.toString(stArr));
        String b = "a b  c d";
        String[] stArr2 = b.split("\\s+"); // 공백분리
        System.out.println(Arrays.toString(stArr2));*/
/*//        isEmpty() null 구분
        String st1 =null;
        String st2 = "";
        System.out.println(st1 == null);
        System.out.println(st2 == null);
        System.out.println(st2.isEmpty());
//        NullPointer Exceotion 예외 발생.
        System.out.println(st1.isEmpty());
        String[] arr = new String[5];
        arr[0] = "hello";
        arr[1] = "world";*/

/*//        join
        String[] arr ={"JAVA", "JS", "C"};
        String  pl = String.join(" " , arr);
        System.out.println(pl);*/

/*//        StringBuffer : 문자열을 추가하거나 변결 할 때 주로 사용
//        append(추가) insert(삽입) substring(자르기) delete(삭제) 등이 있다.
        StringBuffer sb1 = new StringBuffer("hello");
        System.out.println(sb1);
        sb1.append(" world");
        System.out.println(sb1);
        sb1.insert(5, " java");
        System.out.println(sb1);
        System.out.println(sb1.substring(6,10));
        sb1.delete(6,11);
        System.out.println(sb1);*/

////        성능 : String < StringBuffer < StringBuilder (스레트 safe X)
//        StringBuilder sb2 =new StringBuilder("hello");
//        sb2.append(" world");
//        System.out.println(sb2);
      /*  StringBuffer my_string = new StringBuffer("hello");
        StringBuilder answer = new StringBuilder();
        int n = 3;
        for (int i =0 ; i < my_string.length(); i++){
            for (int j = 0;j < n; j++){
                answer.append(my_string.substring(i, i + 1));
            }
        }
        System.out.println(answer);*/

//        StringBuffer a = new StringBuffer("hello");
//        StringBuffer b = new StringBuffer("lohel");

//        int answer = 0;
//
//        for (int i = 1; i < a.length(); i++){
//            a.insert(0, a.charAt(a.length()-1));
//            a.delete(a.length()-1 , a.length());
//            if(a.toString().equals(b.toString())){
//                answer = i;
//                break;
//            }else {
//                answer = -1;
//            }
//        }
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(a.toString().equals(b.toString()));
//        System.out.println(answer);
    }

}
