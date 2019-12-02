import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: BaiMiao
 * @Date: 2019/12/2 17:43
 * @Description:
 */

public class Test3 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        // 取完数据继续poll返回null
        System.out.println(queue.poll());
    }
}
