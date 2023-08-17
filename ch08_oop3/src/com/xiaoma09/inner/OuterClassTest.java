package com.xiaoma09.inner;

/**
 * ClassName: OuterClassTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/16 9:49
 * @Version 1.0
 */
public class OuterClassTest {
    public static void main(String[] args) {

        //1.创建Person的静态的成员内部类的实例
        Person.Dog dog = new Person.Dog();
        dog.eat();

        //2.创建Person的非静态的成员内部类的实例
        //Person.Bird bird = new Person.Bird();//报错
        //非静态成员内部类要造对象的话必须使用外部类的对象new一个
        Person p1 = new Person();
        Person.Bird bird = p1.new Bird();
        bird.eat();
        bird.show("bird2");

        System.out.println();

        bird.show1();
    }
}

class Person{//外部类
    String name = "Tom";
    int age = 1;

    //静态的成员内部类
    static class Dog{
        public void eat(){
            System.out.println("dog eat");
        }
    }

    //非静态的成员内部类
    class Bird{
        String name = "bird1";
        public void eat(){
            System.out.println("bird eat");
        }

        public void show(String name){
            System.out.println("age = " + age);
            System.out.println("name = " + name);
            System.out.println("name = " + this.name);
            System.out.println("name = " + Person.this.name);
        }

        public void show1(){
            eat();
            this.eat();
            Person.this.eat();
        }
    }
    public void eat(){
        System.out.println("person eat");
    }

    public void method(){
        //局部内部类
        class InnerClass1{

        }
    }

    public Person(){
        //局部内部类
        class InnerClass1{

        }
    }
    {
        class InnerClass1{

        }
    }
}