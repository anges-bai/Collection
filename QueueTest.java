import java.util.LinkedList;

/**
 * @Author: BaiMiao
 * @Date: 2019/12/12 19:53
 * @Description:
 * 使用LinkedList模拟一个队列---先进先出
 */
class QueueList{
    LinkedList<Object> q=new LinkedList<>();
    public void add(Object o){
        q.addFirst(o);
    }
    public void remove(){
        while(!q.isEmpty()){
            System.out.println(q.removeLast());
        }
    }
}
public class QueueTest {
    public static void main(String[] args) {
        QueueList queueList=new QueueList();
        queueList.add(1);
        queueList.add(2);
        queueList.add(3);
        queueList.add(4);
        queueList.add(5);
        queueList.remove();
    }
}
