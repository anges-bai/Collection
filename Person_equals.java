import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author: BaiMiao
 * @Date: 2019/12/16 20:29
 * @Description:
 * 在HashSet集合中添加三个Person对象，把姓名相同的人当做同一个人，禁止重复添加。要求如下:
 * Person类中定义name，age属性，重写hashCode()方法和equals()方法，
 * 针对Person类的name属性进行比较，若name相同，hashCode()方法的返回值相同，equals()返回true
 *
 */
class Person  {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int hashCode(){
        return name.hashCode();
    }
    public boolean equals(Object obj){
        Person p=(Person) obj;
        if (this.name.equals(p.name)){
            return true;
        }else{
            return false;
        }

    }
}
public class MyClass8 {
    public static void main(String[] args) {
        Person p1=new Person("aa",11);
        Person p2=new Person("bb",22);
        Person p3=new Person("aa",16);
        Set<Person> set=new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        Iterator it=set.iterator();
        while (it.hasNext()){
            Person p=(Person) it.next();
            System.out.println(p.getName()+":"+p.getAge());
        }
    }
}
