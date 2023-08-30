package com.xiaoma01.use.exer1;

/**
 * ClassName: MyDate
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/29 15:27
 * @Version 1.0
 */
public class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "年" + month + "月" + day + "日";
    }

    @Override
    public int compareTo(MyDate o) {
        int yearDistance = this.getYear() - o.getYear();
        if(yearDistance != 0){
            return yearDistance;
        }
        int monthDistance = this.getMonth() - o.getMonth();
        if(monthDistance != 0){
            return monthDistance;
        }
        return this.getDay() - o.getDay();
    }
}
