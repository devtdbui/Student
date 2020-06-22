/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Bui Dat
 */
public class Student {

    private String name;
    private String className;
    private double math;
    private double physical;
    private double chemistry;

    public Student() {
    }

    public Student(String name, String className, double math, double physical, double chemistry) {
        this.name = name;
        this.className = className;
        this.math = math;
        this.physical = physical;
        this.chemistry = chemistry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysical() {
        return physical;
    }

    public void setPhysical(double physical) {
        this.physical = physical;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getAvg() {
        return (math + physical + chemistry) / 3;
    }

    public String getType() {
        double mark = getAvg();
        if (mark > 7.5) {
            return "A";
        } else if (mark >= 6 && mark <= 7.5) {
            return "B";
        } else if (mark >= 4 && mark < 6) {
            return "C";
        }
        return "D";
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Class: " + className + "\n" + "AVG: " + String.format("%.2f", getAvg()) + "\n" + "Type: " + getType();
    }

}
