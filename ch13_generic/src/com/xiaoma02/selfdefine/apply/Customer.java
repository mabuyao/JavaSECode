package com.xiaoma02.selfdefine.apply;

import java.util.Date;

/**
 * ClassName: Customer
 * Description:
 * ORM思想(object relational mapping)
 * 数据库中的一个表与java中的一个类对应
 * 表中的一条记录与java类中的一个对象对应
 * 表中的一个字段（列）与java中的一个属性（列）对应
 * @Author Mabuyao
 * @Create 2023/8/29 16:55
 * @Version 1.0
 */
public class Customer {
    int id;
    String name;
    String email;
    Date birth;
}
