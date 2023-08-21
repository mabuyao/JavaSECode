package com.xiaoma06.project.myteam.domain;

/**
 * ClassName: Printer
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/18 11:33
 * @Version 1.0
 */
public class Printer implements Equipment{
    private String name;//机器型号
    private String type;//机器类型

    public Printer() {
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }
}
