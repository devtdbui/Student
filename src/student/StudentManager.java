/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Bui Dat
 */
public class StudentManager {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        StudentManager sm = new StudentManager();
        Scanner sc = new Scanner(System.in);
        InputCheck ic = new InputCheck();
        while (true) {
            String name = ic.getName();
            String className = ic.getClassName();
            System.out.print("input math: ");
            double math = ic.getMark();
            System.out.print("input physical: ");
            double physical = ic.getMark();
            System.out.print("input chemistry: ");
            double chemistry = ic.getMark();
            list.add(new Student(name, className, math, physical, chemistry));
            if (ic.inputYN().equalsIgnoreCase("N")) {
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("------ Student " + (i + 1) + " Info ------");
            System.out.println(list.get(i));
        }
        System.out.println("-------- Classification Info --------");
        HashMap<String, Double> hashMap = sm.getPercentTypeStudent(list);
        hashMap.forEach((key, value) -> System.out.println(key + ": " + value + "%"));
    }

    public HashMap<String, Double> getPercentTypeStudent(List<Student> list) {
        HashMap<String, Double> hashMap = new HashMap<>();
        //b1: dem so luong sinh vien A ,B,C,D
        //b2: add vao map
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (Student o : list) {
            if (o.getType().equals("A")) {
                a++;
            } else if (o.getType().equals("B")) {
                b++;
            } else if (o.getType().equals("C")) {
                c++;
            } else {
                d++;
            }
        }
        hashMap.put("A", (100.0 * a / list.size()));
        hashMap.put("B", (100.0 * b / list.size()));
        hashMap.put("C", (100.0 * c / list.size()));
        hashMap.put("D", (100.0 * d / list.size()));
        return hashMap;
    }
}
