import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year=0, month=0, week=0, day=0, i=0;
        int lastday[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("[달력 출력 프로그램]");
        System.out.printf("달력의 년도를 입력해 주세요.(yyyy): ");
        year = sc.nextInt();

        System.out.print("달력의 월을 입력해 주세요.(mm): ");
        month = sc.nextInt();

        System.out.println();

        System.out.printf("[%04d년 %02d월]", year, month);
        System.out.println();

        day = (year) * 365 + (year-1) / 4 - (year - 1) / 100 + (year - 1)/400;

        for(i = 0; i < month - 1; i++) {
            day += lastday[i];
        }
        week = day % 7;
        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n", "일", "월", "화", "수", "목", "금", "토");
        for(i = 0; i < week; i++) {
            System.out.print("\t");
        }
        for(i = 1; i <= lastday[month - 1]; i++) {
            System.out.printf("%02d\t", i);
            week++;
            if(week % 7 == 0)
                System.out.println();
        }
        if(week%7 != 0) {
            System.out.println();
        }
    }
}