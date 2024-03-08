package variable;

public class Variable3 {
    public static void main(String[] args) {
        int a=10;
        String str1="abc"; //str1에는 String pool 메모리에서 abc가 시작되는 주소가 담겨있음 -> str1: reference type 변수
        String str2=new String("abc"); //str2는 heap 영영의 주소를 참조
        String str3="abc"; //"abc"는 str1이 이미 참조하고 있으므로 str3에는 str1에 들어있는 주소와 같은 주소가 들어감
        String str4=new String("abc"); //str4는 heap 메모리에 새롭게 만들어짐, str2와 str4가 참조하는 주소값은 다르다.

        if(str1==str3) {
            System.out.println("str1과 str3이 참조하는 주소값 같음");
        }
        if(str1.equals(str3)) {
            System.out.println("str1과 str3에 저장된 문자열 같음");
        }
        if(str2!=str4) {
            System.out.println("str2과 str4이 참조하는 주소값 다름");
        }

        str3="10"; //String pool에 한번 만들어진 string은 바꿀수 없다. str3은 "ab"를 가리키는 새로운 참조값으로 바뀜. 이때 jvm은 garbage collector.
        str1="ab";

        int result=Integer.parseInt(str3) * 1;
        System.out.println(result);

        int num=100;
        String result2=num+""; //숫자 + String -> 둘 다 String으로 취급
    }
}
