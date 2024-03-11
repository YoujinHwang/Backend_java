package array;

import java.util.Random;

public class Array7 {
    public static void main(String[] args) {
        //5행 5열의 배열에
        //각 열에 Random 하게 중복되지 않은 1~100까지의 수를 발생시킨다.
        //각 열에 최대값의 합과 최소값의 합을 출력하시오.
        int arr[][]=new int[5][5];
        Random r=new Random();
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                int num=r.nextInt(100)+1;
                arr[i][j]=num;

                for(int x=0;x<i;x++) {
                    if(num==arr[x][j]) {
                        j--;
                        break;
                    }
                }
            }

        }
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.printf("[%d][%d] : %d ",i,j,arr[i][j]);
            }
            System.out.println();
        }

        int minsum=0;
        int maxsum=0;

        for(int i=0;i<arr[0].length;i++) {
            int min=arr[0][i];
            int max=arr[0][i];
            for(int j=0;j<arr.length;j++) {
                min = (min < arr[j][i]) ? min : arr[j][i];
                max = (max > arr[j][i]) ? max : arr[j][i];
            }
            System.out.printf("%d %d\n",min, max);
            minsum+=min;
            maxsum+=max;

        }

        System.out.println("minsum: "+ minsum);
        System.out.println("maxsum: "+ maxsum);
    }
}
