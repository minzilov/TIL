//컴퓨터프로그래밍 5주차 과제
//"*"를 한 개씩 증가함녀서 출력하시오.
public class pratice3 {
    public static void main(String[] args){
        for(int i=0; i<6; ++i){
            for(int j=0; j<i; ++j){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}