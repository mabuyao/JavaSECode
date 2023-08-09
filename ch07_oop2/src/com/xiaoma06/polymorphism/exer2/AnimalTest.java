package com.xiaoma06.polymorphism.exer2;

/**
 * ClassName: AnimalTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/8 9:53
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();

        test.adopt(new Dog());
        test.adopt(new Cat());
    }

    public void adopt(Animal animal) {
        animal.eat();
        animal.jump();

        if (animal instanceof Dog) {//instanceof --> 的实例
            Dog dog = (Dog) animal;
            dog.watchDoor();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchRat();
        }
    }

//    public void adopt(Dog dog){
//        dog.eat();
//        dog.jump();
//    }
//
//    public void adopt(Cat cat){
//        cat.eat();
//        cat.jump();
//    }
}

class Animal {
    public void eat() {
        System.out.println("animal eat");
    }

    public void jump() {
        System.out.println("animal jump");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("dog eat");
    }

    public void jump() {
        System.out.println("dog jump");
    }

    public void watchDoor() {
        System.out.println("dog watchDoor");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("cat eat");
    }

    public void jump() {
        System.out.println("cat jump");
    }

    public void catchRat() {
        System.out.println("cat catch rat");
    }
}