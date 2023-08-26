package com.xiaoma04.compare.comparator;

import com.xiaoma04.compare.Product;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: ComparatorTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/24 10:27
 * @Version 1.0
 */
public class ComparatorTest {
    @Test
    public void test1(){
        Product[] arr = new Product[5];
        arr[0] = new Product("HuaweiMate50pro", 6999);
        arr[1] = new Product("Xiaomi11", 4999);
        arr[2] = new Product("iPhone12", 7999);
        arr[3] = new Product("OPPOFindX3", 5999);
        arr[4] = new Product("VivoX60", 3999);

        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Product && o2 instanceof Product){
                    Product p1 = (Product) o1;
                    Product p2 = (Product) o2;
//                    if(p1.getPrice() > p2.getPrice()){
//                        return 1;
//                    }else if(p1.getPrice() < p2.getPrice()){
//                        return -1;
//                    }else{
//                        return 0;
//                    }
                    return Double.compare(p1.getPrice(),p2.getPrice());
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        });

        //排序完，遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    @Test
    public void test2(){
        String[] arr = new String[]{"Tom","Jerry","Tony","Rose","Jack","Lucy"};

        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof String){
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        });

        //排序完，遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
