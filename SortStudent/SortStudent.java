package SortStudent;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SortStudent {
    public static void main(String[] args) throws IOException {
        int temp;
        int i = 0;
        int j = 0;
        int k = 0;
        int x = 0;
        String temp_name = ("");

        int[] sum = new int[20];
        int[] eng = new int[20];
        int[] kokugo = new int[20];
        int[] math = new int[20];
        int[] number = new int[20];
        String[] name = new String[20];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(i = 0; i < 20; i++){
            int input = Integer.parseInt(br.readLine());

            if(input != 0){
                System.out.println((i + 1) + " " + "/20" + "AttendanceNumber" + (input));
                number[i] = input;

                System.out.println((i + 1) + " " + "/20" + "name:");
                name[i] = br.readLine();

                System.out.println((i + 1) + " " + "/20" + "English");
                eng[i] = Integer.parseInt(br.readLine());

                System.out.println((i + 1) + " " + "/20" + "Langage");
                kokugo[i] = Integer.parseInt(br.readLine());

                System.out.println((i + 1) + " " + "/20" + "Sugaku");
                math[i] = Integer.parseInt(br.readLine());
            }else{
                x++;
            }
            if(i == 20 || x == 1){
                System.out.println("******AfterSort*****");
            }else{
                System.out.println("------------");
                k++;
            }
        }

        for(i = 1; i < k; i++){
            for(j = 0; (j > 0) && (sum[j-1] > sum[j]);){
                if(sum[j-1] > sum[j]){
                    temp = sum[j-1];
                    sum[j-1] = sum[j];
                    sum[j] = temp;

                    temp = kokugo[j - 1];
                    kokugo[j-1] = kokugo[j];
                    kokugo[j] = temp;
                }
            }
        }

    }
}