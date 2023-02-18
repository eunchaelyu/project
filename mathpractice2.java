import java.util.Arrays;

public class mathpractice2 {
    public static void solution(int[] arr) {
        if (arr == null ||arr.length <2){
            return;
        }
        int idx= -1;
        for(int i = arr.length-1; i>= 1; i--){ //우측부터 순회를 하면서 더 큰값이 있는지 확인
            if (arr[i] < arr[i-1]){  //더 큰값이 있다면
                idx = i-1;      //그 값을 idx에 넣어서 바꿔주기
                break;
            }
        }
        if (idx ==-1){    //idx가 그대로 -1이라면 더 큰 수를 못찾은 것.
            System.out.println(Arrays.toString(arr));   //현재 상태 그대로 출력 시킴
            return;
        }
        for(int i =arr.length-1; i>idx; i--){   //바꿔줄 대상을 찾았다면 어느 값이랑 바꿀지 선택
            if(arr[i] < arr[idx] && arr[i] !=arr[i-1]){  //하나 왼쪽값이랑 같으면 안 됨.
                int tmp =arr[i]; //교환을 해주기
                arr[i]=arr[idx];
                arr[idx]=tmp;
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}