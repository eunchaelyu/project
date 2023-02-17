class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        
        for(int i=0; i<=n; i++){ //n 이하 정수값을 돌면서
            if((i%2) == 1){  //홀수라면
                answer[i/2]=i; //그 전 인덱스값에 i값을 대입한다
        }
            }
                return answer;
        }
}