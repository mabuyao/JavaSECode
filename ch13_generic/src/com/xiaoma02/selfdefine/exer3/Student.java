package com.xiaoma02.selfdefine.exer3;

import java.util.Objects;

/**
 * ClassName: Student
 * Description:
 * 我们要声明一个学生类，该类包含姓名、成绩。而此时学生的成绩类型不确定，为什么呢？
 * 因为，语文老师希望成绩是“优秀”、“良好”、“及格”、“不及格”，数学老师希望成绩是89.5, 65.0，
 * 英语老师希望成绩是'A','B','C','D','E'。那么我们在设计这个学生类时，就可以使用泛型。
 * @Author Mabuyao
 * @Create 2023/8/29 17:44
 * @Version 1.0
 */
public class Student<T> {
    private String name;
    private T score;

    public Student() {
    }

    public Student(String name, T score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getScore() {
        return score;
    }

    public void setScore(T score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student<?> student = (Student<?>) o;
        return Objects.equals(name, student.name) && Objects.equals(score, student.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }
}
