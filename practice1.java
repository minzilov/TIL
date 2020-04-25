import java.util.Arrays;
import java.util.Scanner;

//컴퓨터 프로그래밍 5주차 과제 
//정수를 입력받아서 소수인지 아닌지 판별하세요.

public class practice1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("정수를 입력하시오.");
        int a = scn.nextInt();

        if(a==1){System.out.pritnln("1은(는) 소수가 아닙니다.");}
        if(a==2){System.out.println("2은(는) 소수 입니다.");}

        

    }
}