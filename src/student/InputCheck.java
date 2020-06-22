/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Bui Dat
 */
public class InputCheck {

    Scanner sc = new Scanner(System.in);

    public String inputYN() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Do you want to enter more student information?(Y/N):");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("N") || choice.equalsIgnoreCase("Y")) {
                return choice;
            } else {
                System.out.println("Please input Y or N");
            }
        }
    }

    public String getName() {
        String name = "";
        while (true) {
            System.out.print("input name: ");
            name = sc.nextLine();
            Pattern p = Pattern.compile("^[a-zA-Z]+$");
            if (p.matcher(name).find()) {
                break;
            } else {
                System.err.println("invalid name, please input name again");
            }
        }
        return name;
    }

    public String getClassName() {
        String className = "";
        while (true) {
            System.out.print("input class: ");
            className = sc.nextLine();
            if (!className.trim().equals("")) {
                return className;
            } else {
                System.out.print("Empty class name, please input again");
            }
        }
    }

    public double getMark() {
        double number = 0;
        while (true) {
            try {
                number = Double.parseDouble(sc.nextLine());
                if (number >= 0 && number <= 10) {
                    break;
                } else {
                    System.out.print("please input mark within 0-10: ");
                }
            } catch (Exception e) {
                System.err.println("invalid mark, please input again: ");
            }
        }
        return number;
    }

}
