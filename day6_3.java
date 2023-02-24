public class day6_3 {
    class Solution {
        public int[] solution(int[] num_list) {
            int cnt_a=0;
            int cnt_b=0;
            int answer[] = new int[2];
            for(int i=0; i<num_list.length; i++){
                if(num_list[i]%2==0){
                    cnt_a +=1;
                }
                else{
                    cnt_b +=1;
                }
            }
            answer[0]=cnt_a;
            answer[1]=cnt_b;
            return answer;
        }
    }
}
