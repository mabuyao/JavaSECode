package com.xiaoma07._abstract.exer1;

/**
 * ClassName: GeometricTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/8 13:52
 * @Version 1.0
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();

        Circle c1 = new Circle("red", 1.0, 2.3);
        Circle c2 = new Circle("red", 1.0, 3.3);

        test.displayGeometricObject(c1);
        test.displayGeometricObject(c2);

        boolean isEquals = test.equalsArea(c1, c2);
        if (isEquals) {
            System.out.println("面积相等");
        } else {
            System.out.println("面积不相等");
        }

        //使用匿名对象
        test.displayGeometricObject(new MyRectangle("blue", 1.0, 2.3, 4.5));
    }

    /**
     * 比较两个几个图形的面积是否相等
     *
     * @param g1
     * @param g2
     * @return true 面积相等； false 面积不等
     */
    public boolean equalsArea(GeometricObject g1, GeometricObject g2) {
        return g1.findArea() == g2.findArea();
    }

    /**
     * 显示输入几何图形的面积
     *
     * @param g
     */
    public void displayGeometricObject(GeometricObject g) {//GeometricObject g = new Circle("red",1.0,2.3);
        System.out.println("几何图形的面积为：" + g.findArea());//动态绑定 <--> 静态绑定
    }
}
