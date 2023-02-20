import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[입장권 계산]");
        System.out.printf("나이를 입력해 주세요. (숫자):");
        int price = 10000; //기본 입장료
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.printf("입장시간을 입력해 주세요. (숫자입력):");
        int time = sc.nextInt();
        System.out.printf("국가유공자 여부를 입력해 주세요. (y/n):");
        char 국가유공자 = sc.next().charAt(0);
        System.out.printf("복지카드 여부를 입력해 주세요. (y/n):");
        char card = sc.next().charAt(0);
        if (age < 3) {
            price = 0;
        } else if(age >= 3 && age < 13) {
            price = 4000;
        } else if(time >= 17){
            price = 4000;
        } else if(국가유공자 == 'y' || card == 'y' ) {
            price = 8000;
        }

        System.out.println("입장료: " + price);
    }
}