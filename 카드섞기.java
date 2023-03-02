public class 카드섞기 {
    import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class Practice1 {
    public static int findLastCard(int N) {
        Queue queue = new LinkedList();  //큐에 대한 기본 자료 만들기

        IntStream.range(1, N + 1).forEach(x -> queue.add(x));  //1부터 N 까지 큐에 추가함.
        System.out.println(queue);

        while (queue.size() > 1) {  //데이터가 마지막 하나가 남을 동안 계속 반복
            queue.remove(); //일단 한 장 버림
            int data = (int)queue.remove(); //그 다음 카드는 꺼낸 다음
            queue.add(data);  //데이터의 맨 마지막에 추가
            System.out.println(queue);
        }

        return (int)queue.remove();
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(findLastCard(4));    // 4
        System.out.println(findLastCard(7));    // 6
        System.out.println(findLastCard(9));    // 2
    }
}

}
