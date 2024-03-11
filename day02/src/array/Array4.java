package array;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

public class Array4 {
    public static void main(String[] args) {
//        Random r=new Random();
//        int num=r.nextInt(10)+1;
//        System.out.println(num);

        //int 형 배열, 사이즈 10개
        //배열에 1~100까지의 숫자를 Random 하게 넣고
        //단, 중복되지 않는 숫자를 입력한다.
        //합과 평균을 구하시오
        int[] arr=new int[10];
        int sum=0;
        Random r=new Random();
        for(int i=0;i<10;i++) {
            int num=r.nextInt(100)+1;
            while (true) {
                for(int a:arr) {
                    if(num==a) {
                        num=r.nextInt(100)+1;
                        break;
                    }
                }
                arr[i]=num;
                break;
            }
        }

        for(int s:arr) {
            sum+=s;
        }
        int avg=sum/10;
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum: "+sum);
        System.out.println("Avg: "+avg);
    }

}
