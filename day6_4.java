public class day6_4 {
    class Solution {
        public String solution(String my_string, int n) {
            String answer = "";
            int j = my_string.length();
            for(int i=0; i<j; i++){
                for(int k=0; k<n; k++){
                    answer += my_string.charAt(i);
                }
            }
            return answer;
        }
    }
}
