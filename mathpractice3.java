import java.util.ArrayList;

public class mathpractice3 {
    // # 1 기본 permutation 방법
    public static boolean solution(String s1, String s2) {
        boolean[] visited = new boolean[s1.length()];  //visited 배열 만든다
        char[] out = new char[s1.length()];            // out 배열 만든다
        ArrayList<String> list = new ArrayList<>();
        permutation(s1.toCharArray(), 0, s1.length(), s1.length(), visited, out, list); //매개변수

        for (String s: list) {   //list에 있는 것을 돌면서
            if (s2.contains(s)) { //s2에 포함되어있는지 확인
                return true;
            }
        }
        return false;
    }

    // 기존 permutation 코드 문제에 맞춰 변형
    public static void permutation(char[] arr, int depth, int n, int r, boolean[] visited, char[] out, ArrayList<String> list) {
        if (depth == r) {
            list.add(new String(out));
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                out[depth] = arr[i];
                permutation(arr, depth + 1, n, r, visited, out, list);
                visited[i] = false;
            }
        }
    }


    // # 2 문제 규칙 찾아 해결
    public static boolean solution2(String s1, String s2) {
        final int ALPHABET = 26; //알파벳 개수

        // s1 이 s2 보다 긴 경우 s1 으로 permutation 하여 s2 의 부분이 될 수 없으므로 false 반환
        if (s1.length() > s2.length()) {
            return false;  //예외처리
        }

        // s1 알파벳별 개수 카운팅
        int[] cnt = new int[ALPHABET];  //알파벳을 셀 카운팅 배열 잡아주기
        for (int i = 0; i < s1.length(); i++) {  // s1사이즈 만큼 돌면서
            cnt[s1.charAt(i) - 'a']++;  //s1 알파벳에 해당되는 값을 아스키코드 사용, a=0,b=1이 됨.
        }

        for (int i = 0; i < s2.length(); i++) {
            // s2 에 해당하는 알파벳 위치 카운트 감소
            cnt[s2.charAt(i) - 'a']--;
            // s1 의 길이를 넘어선 경우, on/off 형태로 체크
            if (i - s1.length() >= 0) {
                cnt[s2.charAt(i - s1.length()) - 'a']++;  //다시 카운트 1 증감
            }

            // 카운트 배열이 모두 0 이면 permutation 으로 만들 수 있는 부분 문자열이 있음
            boolean isZero = true;
            for (int j = 0; j < ALPHABET; j++) {
                if (cnt[j] != 0) {    //j가 알파벳만큼 돌면서 0이 아닌 값이 있다면 false값을 리턴한다.
                    isZero = false;
                    break;
                }
            }

            if (isZero) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Test code
        String s1 = "ab";
        String s2 = "adbak";
        System.out.println(solution(s1, s2));
        System.out.println(solution2(s1, s2));
        System.out.println();

        s1 = "ac";
        s2 = "car";
        System.out.println(solution(s1, s2));
        System.out.println(solution2(s1, s2));
        System.out.println();

        s1 = "ak";
        s2 = "aabbkk";
        System.out.println(solution(s1, s2));
        System.out.println(solution2(s1, s2));
    }
}
