import java.util.*;

/**
 * @Author: BaiMiao
 * @Date: 2019/11/28 17:14
 * @Description:
 */
public class MyClass {
    public static void main(String[] args) {
       /* List<String> list=new ArrayList<String>();
        list.add("a1");
        list.add("a2");
        list.add("666");
        list.remove("a2");
        System.out.println(list);
        System.out.println(list.isEmpty());*/

       /*List<String> list1=new LinkedList<>();
       list1.add("i");
       list1.add("am");
       list1.add("LinkedList");
        System.out.println(list1);
        System.out.println(((LinkedList<String>) list1).getLast());*/

       /*Set<String> set=new HashSet<>();
       set.add("hello");
       set.add("world");
       set.add("hello");
       set.add("bit");
       set.add("hi");
        System.out.println(set);
        System.out.println(set.size());*/
        //无重复元素，无序

      /*Set<String> set1=new TreeSet<>();
      set1.add("5");
      set1.add("2");
      set1.add("3");
      set1.add("2");
      set1.add("5");
        System.out.println(set1);*/
        //无重复元素，可以排序

        /*Map<String,String> map=new HashMap<>();
        map.put("key1","aa");
        map.put("key2","bb");
        map.put("key3","cc");
        for (String key:map.keySet()){
            System.out.println(key+":"+map.get(key));
        }*/

        List<String> list2=new LinkedList<>();
        list2.add("aaa");
        list2.add("bbb");
        list2.add("ccc");
        list2.add("ddd");
        Iterator it=list2.iterator();
        while (it.hasNext()){
            String s=(String)it.next();
            System.out.println(s);
        }
    }
}
