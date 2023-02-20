
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[캐시백 계산]");
        System.out.println("결제 금액을 입력해 주세요. (금액):");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int cashback = number/10;
        if (100 <= cashback && cashback < 300){
            cashback = (cashback/100) * 100;
        } else if(cashback >= 300){
            cashback = 300;
        }
        System.out.println("결제 금액은 " + number + "원이고, 캐시백은 " + cashback + "원 입니다.");
    }
}