package com.xiaoma05._super.exer1;

/**
 * ClassName: Kids
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/4 11:09
 * @Version 1.0
 */
public class Kids extends ManKind {
    private int yearsOld;

    public Kids() {

    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public Kids(int sex, int salary, int yearsOld) {
        super(sex, salary);
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge() {
        System.out.println("I am " + yearsOld + " years old.");
    }

    @Override
    public void employeed() {
        super.employeed();
        System.out.println("Kids should study and no job.");
    }
}
