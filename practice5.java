//컴퓨터 프로그래밍 6주차 수업 내용 복습
public class practice5 {
    public static void main(String[] args){
        for (int i=0; i<5; ++i){
            for(int j=0; j<5; ++j){
                if(i==j) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}