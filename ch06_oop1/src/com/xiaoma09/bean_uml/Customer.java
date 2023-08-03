package com.xiaoma09.bean_uml;

/**
 * ClassName: Customer
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/3 11:51
 * @Version 1.0
 */
public class Customer {
    public Customer(){

    }

    private int id;
    private String name;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
