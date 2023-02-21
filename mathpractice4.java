import java.util.HashSet;

public class mathpractice4 {
    // 수열 반복 특성을 이용해 해결하는 문제
    public static boolean solution(int n) {
        HashSet<Integer> set = new HashSet<>();  //중간에 더 이상 데이터를 추가 하지 못하고 같은 수열을 반복하게 되면 종료

        // HashSet 에 데이터 추가 성공하면 true 반환, 실패하면 false 반환
        // 반복되는 수열이 등장할 때 false 로 인해 while 문 종료
        while (set.add(n)) {   //반복문 돌리면서 n을 set 에 추가함
            int squareSum = 0; //각 자리수 제곱한 값의 합을 0으로 초기화
            // 각 자리수 제곱의 합
            while (n > 0) {  // n이 0보다 클 때까지 계속 반복하며
                int remain = n % 10;  //remain에 10으로 나눈 나머지를 둠(일의 자리 수 먼저 계산하기 위함)
                squareSum += remain * remain;
                n /= 10; //10 나눠서 몫의 제곱을 다시 구할 것(10의 자리 수 , 그 다음 100의 자리 수 이런 순으로 게산하도록)
            }
            
            // 1에 도달하면 true 반환
            if (squareSum == 1) {  //1이면
                return true;  //true
            } else {
                n = squareSum;  // 아니라면 sqaresum을 n에 다시 둠.
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(solution(19));
        System.out.println(solution(2));
        System.out.println(solution(61));
    }
}
