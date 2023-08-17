package com.xiaoma10._enum.exer3;

/**
 * ClassName: Color
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/16 14:49
 * @Version 1.0
 */
public enum Color {
    RED(255,0,0,"red"),
    ORANGE(255,128,0,"orange"),
    YELLOW(255,0,255,"yellow"),
    GREEN(0,255,0,"green"),
    CYAN(0,255,255,"cyan"),
    BLUE(0,0,255,"blue"),
    PURPLE(255,0,255,"purple");

    private final int red;
    private final int green;
    private final int blue;
    private final String description;//颜色的描述

    Color(int red, int green, int blue, String description) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.description = description;
    }

    @Override
    public String toString() {
        return name() + "(" + red + "," + green + "," + blue + ")-->" + description;
    }
}
