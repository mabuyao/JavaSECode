package com.xiaoma01._this.exer2;

/**
 * ClassName: Bank
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/3 17:06
 * @Version 1.0
 */
public class Bank {
    private Customer[] customers;//用于保存多个客户
    private int numberOfCustomer;//用于记录存储的客户的个数

    public Bank() {
        customers = new Customer[10];
    }

    /**
     * 将指定姓名的客户保存在银行的客户列表中
     *
     * @param f
     * @param l
     */
    public void addCustomer(String f, String l) {
        Customer cust = new Customer(f, l);
        customers[numberOfCustomer] = cust;
        numberOfCustomer++;
    }

    /**
     * 获取指定索引位置上的客户
     *
     * @param index
     * @return
     */
    public Customer getCustomer(int index) {
        if (index < 0 || index >= numberOfCustomer) {
            return null;
        }
        return customers[index];
    }

    /**
     * 获取客户列表中存储的客户的个数
     *
     * @return
     */
    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }
}
