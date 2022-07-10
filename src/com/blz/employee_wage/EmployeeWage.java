package com.blz.employee_wage;

public class EmployeeWage {
    static int isPresent = 1;
    static int isPartime_present = 2;
    static int wage_per_hour = 20;
    static int full_day_hours = 8;
    static int part_time_hours = 4;
    static int wage = 0;
    public static void main(String[] args) {
        System.out.println("Well come to Employee Wage computation");
        int checkRandom = (int) Math.floor(Math.random() * 10) % 3;
        switch (checkRandom) {
            case 1:
                System.out.println("Employee is present");
                wage = wage_per_hour * full_day_hours;
                break;
            case 2:
                System.out.println("Employee is part time present");
                wage = wage_per_hour * part_time_hours;
                break;
            default:
                System.out.println("Employee is absent");
                break;
        }
        System.out.println("Employee Wage: " + wage);
    }
}