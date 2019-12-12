import java.util.*;
/**
 * @Author: BaiMiao
 * @Date: 2019/12/12 19:23
 * @Description:
 * 使用LinkedList模拟一个堆栈---先进后出
 */
class StackList{
    LinkedList<Object> s=new LinkedList<>();
    public void add(Object o){
        s.addFirst(o);
    }
    public void remove(){
        while(!s.isEmpty()){
            System.out.println(s.removeFirst());
        }
    }
}
public class StackTest {
    public static void main(String[] args) {
        StackList stackList=new StackList();
        stackList.add("a");
        stackList.add("b");
        stackList.add("c");
        stackList.add("d");
        stackList.add("e");
        stackList.remove();
    }

}
