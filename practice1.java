import java.util.Arrays;
import java.util.Scanner;

//컴퓨터 프로그래밍 6주차 과제 보너스 문제
public class practice1 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
      
      //A가 움직일 배열 설정      
      String [][] map= new String[10][10];

      int x = 0;
      int y = 0;
      
      //반복문 실행
      while(true) {
         
    	  //map 설정
          for(int i = 0; i < 10; ++i) {
               for(int j=0; j < 10; ++j) {
                  map[i][j] = ".";}}
         map[x][y]="A";

        //map 인쇄
          for(int i = 0; i < 10; ++i){
               for(int j=0; j < 10; ++j) 
            	   System.out.print(map[i][j]);
          System.out.println();}
            
          
         //사용자로부터 움직일 값 받기
         System.out.println("오른쪽으로 이동 : D, 왼쪽으로 이동 : A, 위쪽으로 이동 : W, 아래쪽으로 이동 : S 를 입력해주세요.");
         String move = scn.next();
            
          //사용자가 선택한 값에 따라 "A" 이동하기
          if((move.equals("D")||move.equals("d"))) {
        	 if(y<9)
        	  y += 1; 
        	  }
          else if((move.equals("A")||move.equals("a"))) {
        	  if(y>=1)
        	  y -= 1; 
        	  }
          else if((move.equals("W")||move.equals("w"))) {
        	  if(x>=1)
        	  x -= 1; 
        	  }
          else if((move.equals("S")||move.equals("s"))) {
        	  if(x<9)
        	  x += 1; 
        	  }
          else {break;}   
         }
         System.out.println("게임종료");
    }
}