import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: BaiMiao
 * @Date: 2019/11/28 18:42
 * @Description:
 */
class Person implements Comparable<Person>{
    public String name;
    public Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.age>o.age){
            return 1;
        }else if (this.age<o.age){
            return -1;
        }else{
         return this.name.compareTo(o.name);
        }
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Set<Person> set=new TreeSet<>();
        set.add(new Person("john",20));
        set.add(new Person("elsa",17));
        set.add(new Person("john",20));
        set.add(new Person("anges",19));
        System.out.println(set);
    }
}
