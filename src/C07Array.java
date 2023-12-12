import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

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

/*//        StreamApi, lambda를 활용한 내림차수 정렬
        int[] arr = {5,1,2,7,3,1,2};
        Arrays.sort(arr);
        int[] new_arr2 = Arrays.stream(arr)//stream 객체 생성하는 방법
                        .boxed()// Intager 형변환 한 스트림객체생성
                        .sorted(Comparator.reverseOrder())//내림차순 정령
                        .mapToInt(a->a)//Integer를 int로 변환
                        .toArray();//배열로 변환
        System.out.println(Arrays.toString(new_arr2));*/
/*//        선택차순 내림 정렬
        int[] arr =  {30,22,20,25,12};
        int count = 0;

        for (int i = 0; i < arr.length-1;i++){
            for (int j = i+1; j < arr.length;j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr [i] = arr[j];
                    arr[j] = temp;
                    count++;
                    System.out.println("내림차순" + count + "회차" + Arrays.toString(arr));
                }
//                if (arr[i] < arr[j]){
//                    int temp = arr[i];
//                    arr [i] = arr[j];
//                    arr[j] = temp;
//                    count++;
//                    System.out.println("오름차순" + count + "회차" + Arrays.toString(arr));
//                }
            }

        }*/

/*//        숫자 조합의 합 : 각기 다른 숫자의 배열이 있을때 만들어질 수 있는 2개의 조합의 합을 출력 하라.
        int[] int_arr = {10,20,30,40,50,60};
        for (int i = 0 ; i < int_arr.length-1; i++){
            for (int j = i+1; j < int_arr.length; j++){
                int sum = int_arr[i] + int_arr[j];
                System.out.println(int_arr[i]+"와"+int_arr[j]+"을 합은?" + sum);
            }
        }*/
/*//        중복제거하기
        int[] temp ={10,10,40,5,7};
        Arrays.sort(temp);
        int count =0 ;
        int[] new_temp = new int[temp.length];
        for (int i = 0 ; i < temp.length;i++){
            if (i==temp.length -1){
                new_temp[count] = temp[i];
                count ++;
                break;
            }
                if (temp[i] != temp[i+1]){
                    new_temp[count] = temp[i];
                    count ++;
            }

        }

        System.out.println(Arrays.toString(new_temp));*/


/*//        프로그래머스
        int[] numbers ={2,1,3,4,1};

        int[] temp = new int[numbers.length*numbers.length];
        int count =0 ;
        int sum = 0;
        for (int i = 0 ; i < numbers.length-1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                temp[count] = numbers[i]+numbers[j];
                count++;
                }
            }
        int [] answer = Arrays.copyOfRange(temp , 0 ,count );
        Arrays.sort(answer);
        answer = Arrays.stream(answer).distinct().toArray();
        System.out.println(Arrays.toString(answer));*/

/*//        버블정렬
        int[] arr ={5,1,4,3,2};
        for (int i= 0; i<arr.length-1;i++){
            for (int j= 0; j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                int temp = arr[j];
                arr [j] = arr[j+1];
                arr[j+1] = temp;
                    System.out.println("버블" + (i+1) + "회차" + (j+1)+"시도"+Arrays.toString(arr));
            }

        }
        }*/
/*//        배열의 검색
        int[] arr ={5,3,1,8,7};
        int answer = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 8){
                answer = i;
                break;
            }
        }
        System.out.println(answer);*/
/*//        이진 검색(Binary Search)
//        사전에 오름차순 정렬이 되어 있어야 이진검색 가능
        int[] arr ={1,3,6,8,9,11};
        Arrays.sort(arr);//정렬
        int answer = Arrays.binarySearch(arr,8);
        System.out.println(answer);*/

/*//        배열간 비교 : equals, 순서까지 동일해야 true
        int[] arr1 ={10,20,30};
        int[] arr2 ={10,20,30};
        System.out.println(Arrays.equals(arr1,arr2));*/

/*//        배열복사 : copyOf(대상 배열,endIndex ), copyOfRange(대상 배열 ,start , end)
        int[] arr = {10,20,30,40,50,60};
        int[] new_arr1 = Arrays.copyOf(arr,10);
        int[] new_arr2 = Arrays.copyOfRange(arr,1, 4);
        System.out.println(Arrays.toString(new_arr1));
        System.out.println(Arrays.toString(new_arr2));*/

/*//        2차원 배열
        int[][] arr = new int[2][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        System.out.println(Arrays.deepToString((arr)));
//        2차원 가변 배열 선언 및 할당
        int[][] arr2 = new int[3][];
        arr2[0] = new int[1];
        arr2[1] = new int[2];
        arr2[2] = new int[3];
        System.out.println(Arrays.deepToString((arr2)));
//        arr2[0][0] = 10; 이렇게
//        arr2[1][0] = 20; 하면
//        arr2[2][0] = 30; 안됨

//        가변배열 리터널 방식
        int[][] arr3 = {{10},{10,20},{10,20,30}};
        System.out.println(Arrays.deepToString((arr3)));*/

//        [3][4] 사이즈의 배열을 선언 한 뒤
//        1,2,3 ~ 12까지의 숫자 값 각 배열에 할당
  /*      int[][] arr = new int[3][4];
        int count = 1;
        for (int i = 0; i < arr.length;i++){
           for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = count;
                count++;
            }
        }
        System.out.println(Arrays.deepToString((arr)));*/

//        가변배열만들기 : 전체사이즈5
//        각 배열마다 사이즈 1,2,3,4,5로 커지도록 : for 문
//        각 사이즈 별로 1은 10만,2는 20만,3은 30 ...... 들어가도록
        int[][] arr = new int[5][];
        int count =1;
        for (int i = 0; i < arr.length;i++){
            arr[i] = new int[i+1];
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = count * 10;
            }
            count++;
        }
        System.out.println(Arrays.deepToString((arr)));
//        ---------------------건들지 마시오------------------------
    }
}

