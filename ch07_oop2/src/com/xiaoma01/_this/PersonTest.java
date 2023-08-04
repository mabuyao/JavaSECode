package com.xiaoma01._this;

/**
 * ClassName: PersonTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/3 16:01
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(10);
        System.out.println(p1.getAge());

        Person p2 = new Person("Tom", "tom@126.com");
        System.out.println("name = " + p2.name + ", email = " + p2.email);

        p2.eat();
    }
}

class Person {
    String name;
    int age;
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person() {
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("eat");

        this.sleep();
    }

    public void sleep(){
        System.out.println("sleep");
    }
}