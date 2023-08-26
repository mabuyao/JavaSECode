package com.xiaoma04.compare.comparable;

import com.xiaoma04.compare.Product;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * ClassName: ComparableTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/24 9:48
 * @Version 1.0
 */
public class ComparableTest {
    @Test
    public void test1(){
        String[] arr = new String[]{"Tom","Jerry","Tony","Rose","Jack","Lucy"};

        Arrays.sort(arr);

        //排序完，遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    @Test
    public void test2(){
        Product[] arr = new Product[5];
        arr[0] = new Product("HuaweiMate50pro", 6999);
        arr[1] = new Product("Xiaomi11", 4999);
        arr[2] = new Product("iPhone12", 7999);
        arr[3] = new Product("OPPOFindX3", 5999);
        arr[4] = new Product("VivoX60", 3999);

        Arrays.sort(arr);
        //排序完，遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void test3(){
        Product p1 = new Product("HuaweiMate50pro", 6999);
        Product p2 = new Product("Xiaomi11", 4999);
        int compare = p1.compareTo(p2);
        if(compare > 0){
            System.out.println("p1大");
        }else if(compare < 0){
            System.out.println("p2大");
        }else{
            System.out.println("一样大");
        }

    }
}
