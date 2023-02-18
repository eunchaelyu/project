import java.util.ArrayList;

public class mathpractice1 {
    public static ArrayList<ArrayList<Integer>> solution(int numRows) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int i=0; i<numRows; i++){ //각 행에 대한 파스칼 삼각형 수를 ArrayList의 integer에 담는다.
            ArrayList<Integer>list=new ArrayList<>();

        for (int j = 0; j < i + 1; j++) {
            if (j == 0 || j == i) {  //외곽쪽을 뜻함
                list.add(1); //이 때는 1로 함.
            } else {
                int x = result.get(i - 1).get(j - 1);   //좌측값
                int y = result.get(i - 1).get(j);    //우측값
                list.add(x + y);
            }
        }
        result.add(list);
    }
    return result;
    }
}