import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: BaiMiao
 * @Date: 2019/12/12 17:21
 * @Description:
 * 编写一个Book类，该类至少有name，price两个属性。
 * 该类要实现Comparable接口，在接口的compareTo（）方法中规定
 * 两个Book类实例的大小关系为二者的price属性的大小关系。
 * 在主函数中，选择合适的集合类型存放Book类的若干个对象，
 * 然后创建一个新的Book类对象，并检查该对象与集合中的那些对象相等。
 */
class Book implements Comparable{
    public String name;
    public int price;
    public Book(String name,int price){
        this.name=name;
        this.price=price;
    }

    public int compareTo(Object o){
        Book book=(Book)o;
        if (book.price==this.price){
            return 1;
        }else{
            return 0;
        }
    }

}
public class BookTest{
    public static void main(String[] args) {
        List<Book> list=new ArrayList<Book>();
        Book b1=new Book("JAVA",100);
        Book b2=new Book("C++",100);
        Book b3=new Book("go",66);
        list.add(b1);
        list.add(b2);
        list.add(b3);
        Book newbook=new Book("C",100);
        Iterator<Book> it=list.iterator();
        while(it.hasNext()){
            Book bk=it.next();
            if (bk.compareTo(newbook)==1){
                System.out.println(bk.name+" "+bk.price);
            }
        }
    }
}
