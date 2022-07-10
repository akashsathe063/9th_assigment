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
        if (checkRandom == isPresent) {
            System.out.println("Employee is present");
            wage = wage_per_hour * full_day_hours;
        } else if (checkRandom == isPartime_present) {
            System.out.println("Employee is Part time Present");
            wage = wage_per_hour * part_time_hours;
        } else {
            System.out.println("Employee is Absent");
        }
        System.out.println("Employee Wage: " + wage);
    }
}