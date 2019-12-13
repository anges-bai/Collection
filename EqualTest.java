import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: BaiMiao
 * @Date: 2019/12/12 19:59
 * @Description:
 * 将自定义对象作为元素存入到ArrayList集合中，并去除重复元素。
 * 例：存人对象。同名同姓同年龄视为同一人，为重复元素。
 * 思路：对人描述，将数据封装进入对象；定义容器，将人存入。取出。
 * 结论：List集合判断某一个元素是否和集合中的元素相同，使用contains方法，
 *      更具体的说是依据元素的equals方法。
 */
class Person{
    public String name;
    public int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object obj){
        if (!(obj instanceof Person)){
            return false;}
            Person p=(Person) obj;
            return this.name.equals(p.name)&&this.age==p.age;

    }
}
public class EqualsTest {
    public static void main(String[] args) {
        ArrayList<Person> list=new ArrayList<>();
        Person p1=new Person("a",10);
        Person p2=new Person("b",12);
        Person p3=new Person("a",10);
        Person p4=new Person("d",11);
        Person p5=new Person("e",12);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list=singleElement(list);
        Iterator it=list.iterator();
        while (it.hasNext()){
            Person p=(Person) it.next();
            System.out.println(p.getName()+" "+p.getAge());
        }
    }
    public static ArrayList singleElement(ArrayList arr){
        ArrayList<Object> newlist=new ArrayList<>();
        Iterator it=arr.iterator();
        while (it.hasNext()){
            Object obj=it.next();
            if (!newlist.contains(obj)){
                newlist.add(obj);
            }
        }
        return newlist;
    }
}
