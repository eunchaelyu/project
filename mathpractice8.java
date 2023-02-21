
public class mathpractice8 {
    public static String solution(String equation) {
        String[] parts = equation.split("=");  // '='을 기준으로 좌항,우항으로 분리함
        int[] leftSide = evaluate(parts[0]);   //좌항
        int[] rightSide = evaluate(parts[1]);  //우항
//        int[] leftSide = evaluate2(parts[0]);
//        int[] rightSide = evaluate2(parts[1]);

        if (leftSide[0] == rightSide[0] && leftSide[1] == rightSide[1]) {  //0번 인덱스는 x의 계수, 1번 인덱스는 상수 남아있다
            return "Infinite solutions";
        } else if (leftSide[0] == rightSide[0]) {  //x의 계수만 같고 어느 쪽에든 상수항이 남아있는 경우 성립이 안되므로 no solution
            return "No solution";
        }
        return "x=" + (rightSide[1] - leftSide[1]) / (leftSide[0] - rightSide[0]); //항정리
    }

    public static int[] evaluate(String str) {
        // [0] 에는 x 의 계수, [1] 에는 상수항
        int[] result = new int[2];

        // # 1
        boolean isMinus = false; //불리언 변수 잡기
        int idx = 0; //인덱스 잡기
        while (idx != str.length()) {
            char c = str.charAt(idx++);  //반복문 동안 하나의 문자열을 가져옴

            if (c == '+') {  //만약에 +면 처리할 과정이 없음
                continue;
            }

            if (c == '-') { //만약에 -면 불리언 true로 켜주고 계속 진행
                isMinus = true;
                continue;
            }

            if (c == 'x') {
                // x 인 경우 부호에 따라 계수 쪽 업데이트
                result[0] += isMinus ? -1 : 1;
            } else {
                // 숫자인 경우
                // 그 다음이 x 인 경우 체크해줘야함, x 의 계수 부분 업데이트
                if (idx < str.length() && str.charAt(idx) == 'x') {
                    result[0] += isMinus ? -(c - '0') : (c - '0');  //c에서 아스키코드 값 빼면 자신의 값이 나옴
                    idx++;
                } else {
                    // 숫자만 있는 경우 상수항 업데이트
                    result[1] += isMinus ? -(c - '0') : (c - '0');
                }
            }
            isMinus = false; //다시 false로 돌려줌.
        }

        return result;
    }

    // # 2 정규표현식 사용
    public static int[] evaluate2(String str) {
        int[] result = new int[2];

         // + 또는 -는 포함하여 파싱
        for (String s : str.split("(?=[+-])")) {
            if (s.equals("+x") || s.equals("x")) {  //계수가 1인 경우
                result[0]++;
            } else if (s.equals("-x")) {    //계수가 1인 경우
                result[0]--;
            } else if (s.contains("x")) {   //계수가 뜯어진 게 result [0]에 더해질 것.
                result[0] += Integer.parseInt(s.substring(0, s.length() - 1));
            } else {
                result[1] += Integer.parseInt(s);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Test code
        String equation = "x+5-3+x=6+x-2";
        System.out.println(solution(equation));

        equation = "x=x";
        System.out.println(solution(equation));

        equation = "2x=x";
        System.out.println(solution(equation));
    }
}
