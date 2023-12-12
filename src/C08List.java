import java.util.ArrayList;
import java.util.Arrays;

public class C08List {
    public static void main(String[] args) {
//        list 선언방법
//              여기에 이미 할당했으니                String 쓰는건 자유
//        ArrayList<String> myList = new ArrayList<String>();
//        가장 일반적인 방식
//        ArrayList<String> myList = new ArrayList<>();
//        왼쪽엔 인터페이스,오른쪽엔 구현체
        ArrayList<String> myList = new ArrayList<>();

//        초기값 생성방법1. 하나씩 add
        myList.add("java");
        myList.add("python");
        myList.add("c++");
        System.out.println(myList);
//        초기값 생성방법2. 한꺼번에 add(배열을 이용한 변환)
        String[] myArr1 = {"java","python","c++"};
        ArrayList<String> myList2 = new ArrayList<>(Arrays.asList(myArr1));
//        배열이 int인 경우 -> 문제 발생
        int[] myIntArr1 = {1,2,3};
        ArrayList<Integer> myList3 = new ArrayList<>();
        for (int a: myIntArr1){
            myList3.add(a);
        }
    }
}
