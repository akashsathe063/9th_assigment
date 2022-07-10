package com.blz.employee_wage;

public class EmployeeWage {
    static int isPresent = 1;
    static int wage_per_hour = 20;
    static int full_day_hours = 8;
    static int wage = 0;

    public static void main(String[] args) {
        System.out.println("Well come to Employee Wage computation");
        int checkRandom = (int) Math.floor(Math.random() * 10) % 2;
        if (checkRandom == isPresent) {
            System.out.println("Employee is present");
            wage = wage_per_hour * full_day_hours;
        } else {
            System.out.println("Employee is Absent");
        }
        System.out.println("Daily Employee Wage: " + wage);
    }
}