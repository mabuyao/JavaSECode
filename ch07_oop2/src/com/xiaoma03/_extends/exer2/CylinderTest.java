package com.xiaoma03._extends.exer2;

/**
 * ClassName: CylinderTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/4 11:23
 * @Version 1.0
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();

        cy.setRadius(2.3);
        cy.setLength(1.4);

        System.out.println("圆柱的体积为：" + cy.findVolume());

        System.out.println("圆柱的底面积为：" + cy.findArea());
    }
}
