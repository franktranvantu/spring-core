package com.franktran.model;

public class Marks {

    private int studentId;
    private int marks;
    private int years;

    public Marks(int studentId, int marks, int years) {
        this.studentId = studentId;
        this.marks = marks;
        this.years = years;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "studentId=" + studentId +
                ", marks=" + marks +
                ", years=" + years +
                '}';
    }
}
