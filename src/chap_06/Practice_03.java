package chap_06;

import java.util.Scanner;


public class Practice_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = "";

        for (int i = 0; i < n/4; i++) {
            str += "long ";
        }
        System.out.println(str + "int");


    }
}
