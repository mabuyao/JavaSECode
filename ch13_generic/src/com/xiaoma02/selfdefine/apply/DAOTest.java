package com.xiaoma02.selfdefine.apply;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * ClassName: DAOTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/29 17:10
 * @Version 1.0
 */
public class DAOTest {
    @Test
    public void test1(){
        CustomerDAO dao1 = new CustomerDAO();

        dao1.insert(new Customer());

        Customer customer = dao1.queryForInstance(1);

    }

    @Test
    public void test2(){
        OrderDAO dao1 = new OrderDAO();
        dao1.insert(new Order());

        List<Order> list = dao1.queryForList(1);
    }
}
