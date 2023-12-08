import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
 /*       // 배열 표현식1
        int[] int_arr1 = {1,2,3,4};
        // 배열 표현식2
        int[] int_arr2 = new int[4];
        int_arr2[0]=1;
        int_arr2[1]=2;
        int_arr2[2]=3;
        int_arr2[3]=4;
        // 배열 표현식3
        int[] int_arr3 = new int[]{1,2,3,4};
        // 배열 표현식4(불가능) : java의 배열은 반드시 길이가 지정되어야함
//        int[] int_arr4 = new int[];*/
      /*  String[] arr_st = new String[5];
        for (int i=0;i<arr_st.length;i++){
            if (arr_st[i].isBlank()){
                System.out.println("비어있수다."); // 작동 안함
            }
        }
        int[] arr_int = new int[5];
        for (int i=0;i<arr_st.length;i++){
            arr_int[i] += 10;
        }*/
/*//        85,65,90 인 int을 배열을 선언 한뒤, 총합 ,평균값
//         int[] arr1 = {10,20,30,12,8,17};
//        10,20,30,12,8,17 최대값
        int[] arr1 = {10,20,30,12,8,17};
        int all = 0;
        int max = arr1[0];
        int min = arr1[0];
        for (int i=0; i < arr1.length;i++){
            all += arr1[i];
            max = max < arr1[i] ?  arr1[i] : max;
            min = min > arr1[i] ? arr1[i] : min;
        }
        System.out.println("총합 : " + all);
        System.out.println("평균값 : " + all/ arr1.length);
        System.out.println("최대값 :" + max);
        System.out.println("최소값 :" + min);*/
/*//        배열의 순서 바꾸기
        int[] arr = {10,20};
        int a;
        a = arr[0];
        arr[0] = arr[1];
        arr[1] =a;
        System.out.println(Arrays.toString(arr));
        int[] arr2 = {10,20,30,40,50,60,70};
        for (int i = 0 ; i < arr2.length-1;i++){
            int temp = arr2[i];
            arr2 [i] = arr2[i+1];
            arr2[i+1] = temp;
    }
        System.out.println(Arrays.toString(arr2));*/

/*//        배열 뒤집기2
        int[] arr = {1,2,3,4,5,6,7};
//        신규 배열 선언
        int[] arr2 = new int[arr.length];
        for (int i=0;i < arr.length;i++){
            arr2[i] = arr[arr.length -1 -i];
        }
        System.out.println(Arrays.toString(arr2));*/

       /* int[] arr = {1,2,3,4,5,6,7};
        for (int i=0; i < arr.length/2;i++){
                int temp = arr[i];
                arr[i] = arr[arr.length-i-1];
                arr[arr.length-i-1] = temp;
            }
        System.out.println(Arrays.toString(arr));*/

/*//        정렬 : sort()함수 사용
        int[] arr = {5,1,2,7,3,1,2};
//        오른차순정렬이 기본
        Arrays.sort(arr);
//        내림차순
//        방법1. Comparator객체 사용
//        객체타입인 경우에만 Comparator 객체 사용가능
//        Arrays.sort(arr, Comparator.reverseOrder()); int 안됨
        String[] st_arr = {"hello","hi","bye","gooodmorning"};
        Arrays.sort(st_arr);
        System.out.println(Arrays.toString(st_arr));
        Arrays.sort(st_arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(st_arr));
        System.out.println(Arrays.toString(arr));*/

//        StreamApi, lambda를 활용한 내림차수 정렬
        int[] arr = {5,1,2,7,3,1,2};
        int[] new_arr2 = Arrays.stream(arr)//stream 객체 생성하는 방법
                        .boxed()// Intager 형변환 한 스트림객체생성
                        .sorted(Comparator.reverseOrder())//내림차순 정령
                        .mapToInt(a->a)//Integer를 int로 변환
                        .toArray();//배열로 변환
        System.out.println(Arrays.toString(new_arr2));

    }
}
