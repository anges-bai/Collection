import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: BaiMiao
 * @Date: 2019/12/16 20:35
 * @Description:
 * 选择合适的Map集合保存5位学员的学号和姓名，然后按照学号的自然顺序的倒序将这些键值对一一打印出来
 * 1.创建TreeMap集合
 * 2.使用put()方法将学号和姓名存储到Map中
 * 3.使用map.keySet()获取键的Set集合
 * 4.使用Set集合的iterator()方法获得Iterator对象用于迭代键
 * 5.使用Map集合的get()方法获取键所对应的值
 */
public class MyClass9 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1,"Lucy");
        map.put(2,"John");
        map.put(3,"Smith");
        map.put(4,"Aimee");
        map.put(5,"Amanda");
        System.out.println(((TreeMap<Integer, String>) map).descendingMap());
        System.out.println(map.keySet());
        Iterator it=map.keySet().iterator();
        while (it.hasNext()){
            Object key=(Object) it.next();
            Object value=map.get(key);
            System.out.println(key+":"+value);
        }
    }
}
