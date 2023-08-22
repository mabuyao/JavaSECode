package com.xiaoma06.project.myteam.domain;

/**
 * ClassName: Architect
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/18 16:09
 * @Version 1.0
 */
public class Architect extends Designer{
    private int stock;//股票

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t" + stock + "\t" + getEquipment().getDescription();
    }

    public String getDetailsForTeam() {
        return getBasicDetailsForTeam() + "\t架构师\t" + getBonus() + "\t" + getStock();
    }
}
