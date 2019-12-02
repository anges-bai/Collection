import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 * @Author: BaiMiao
 * @Date: 2019/12/2 17:38
 * @Description:
 */
class Order {
    private String title;
    private double price;
    private int amount;

    public Order(String title, double price, int amount) {
        this.title = title;
        this.price = price;
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

public class Test2{
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order("Iphone", 8999.99, 10));
        orderList.add(new Order("外星人笔记本", 12999.99, 5));
        orderList.add(new Order("MacBookPro", 18999.99, 5));
        orderList.add(new Order("Java从入门到放弃.txt", 9.99, 20000));
        orderList.add(new Order("中性笔", 1.99, 200000));
        DoubleSummaryStatistics dss = orderList.stream().
                mapToDouble((obj) -> obj.getPrice() * obj.getAmount()).
                summaryStatistics();
        System.out.println("总量： " + dss.getCount());
        System.out.println("平均值： " + dss.getAverage());
        System.out.println("最大值： " + dss.getMax());
        System.out.println("最小值： " + dss.getMin());
        System.out.println("总和： " + dss.getSum());
    }
}
