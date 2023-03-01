public class day8_2 {
    class Solution {
        public String solution(int age) {
            String answer = "";
            String s = String.valueOf(age);
            String[] arr = s.split("");
            
            for(int i=0; i<arr.length; i++){
                answer+=((char)((Integer.parseInt(arr[i])+97)));
            }
            return answer;
        }
    }
}
