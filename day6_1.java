public class day6_1 {
    class Solution {
        public String solution(String string) {
            String answer = "";
            int j=string.length();
            for (int i=0; i<j; i++){
                answer += string.charAt(j-i-1);
            }
            return answer;
        }
    }
}
