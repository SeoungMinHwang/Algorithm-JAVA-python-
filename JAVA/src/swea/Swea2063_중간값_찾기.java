package swea;

import java.util.Arrays;
import java.util.Scanner;

public class Swea2063_중간값_찾기 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] arr = new int[N];


        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(arr[N/2]);


    }
}
