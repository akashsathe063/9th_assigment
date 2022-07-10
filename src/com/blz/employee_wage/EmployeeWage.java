package com.blz.employee_wage;

public class EmployeeWage {
    static int isPresent = 1;

    public static void main(String[] args) {
        System.out.println("Well come to Employee Wage computation");
        int checkRandom = (int) Math.floor(Math.random() * 10) % 2;
        if (checkRandom == isPresent) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}