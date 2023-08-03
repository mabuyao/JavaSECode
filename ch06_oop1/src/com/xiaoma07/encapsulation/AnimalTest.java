package com.xiaoma07.encapsulation;

/**
 * ClassName: AnimalTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/2 16:41
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal1 = new Animal();

        animal1.name = "金蝉";
        //animal1.legs = 4;//因为legs声明为private，是私有的，出了Animal类之外就不能调用了
        animal1.setLegs(4);
        animal1.setLegs(-2);

        animal1.show();
        //System.out.println("name = " + animal1.name + ", legs = " + animal1.legs);
        System.out.println("name = " + animal1.name + ", legs = " + animal1.getLegs());
        animal1.eat();
    }
}

class Animal{
    String name;
    private int legs;

    public void setLegs(int l){
        if(l >= 0 && l % 2 == 0){
            legs = l;
        }else{
            System.out.println("你输入的数据非法");
        }
    }

    public int getLegs(){
        return legs;
    }

    public void show(){
        System.out.println("name = " + name + ", legs = " + legs);
    }
    public void eat(){
        System.out.println("动物觅食");
    }
}
