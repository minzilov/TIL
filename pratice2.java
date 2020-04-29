//컴퓨터 프로그래밍 5주차 과제
//25부터 1까지 한 줄에 5개씩 출력하시오.

public class pratice2 {
    public static void main(String[] args){
        for(int i=5; i>0; --i){
            for(int j=0; j<6; ++j){
                System.out.printf("%4d",5*i-j);
            }
            System.out.println("");
        }
    }
        
}

