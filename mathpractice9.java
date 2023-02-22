
public class mathpractice9 {
    // 문제에서 overflow 방지 용으로 주어진 수
    final static int mod = (int) 1e9 + 7;

    public static int solution(long n) {
        // 5c1 * 4c1 * 5c1 * 4c1 * ....
        // 5c1 자리 만큼 * 4c1 자리 만큼 재귀로 계산
        return (int) (recursion(5, (n + 1) / 2) * recursion(4, n / 2) % mod);
    } //n=1일 때 5c1을 1회만 수행하세요

    public static long recursion(long x, long y) {
        if (y == 0) {
            return 1;
        }

        long p = recursion(x, y / 2); // y=0이 되어서 위의 식으로 인해 p=1
        return p * p * (y % 2 > 0 ? x : 1) % mod; // ()식은 y가 짝수면 x, 홀수면 1
    } //1*1*5

    public static void main(String[] args) {
        // Test code
        System.out.println(solution(1));
        System.out.println(solution(2));
        System.out.println(solution(3));
        System.out.println(solution(4));
        System.out.println(solution(50));
    }
}
