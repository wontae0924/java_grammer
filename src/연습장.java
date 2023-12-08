public class 연습장 {
    public static void main(String[] args) {
        String my_string = "hello world";
        String answer = "";
        char a;
        for(int i = my_string.length(); i > 0; i--){
            a = my_string.charAt(i);
            System.out.println(a);
        }
        System.out.println(answer);
    }
}
