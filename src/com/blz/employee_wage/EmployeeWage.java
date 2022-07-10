package com.blz.employee_wage;

public class EmployeeWage {
    static int isPresent = 1;
    static int isPartime_present = 2;
    static int working_day_per_month = 20;
    static int max_working_hours = 100;
    static int wage_per_hour = 20;
    static int full_day_hours = 8;
    static int part_time_hours = 4;
    static int wage = 0;
    static int total_wage = 0;
    static int total_hours = 0;

    public static void main(String[] args) {
        System.out.println("Well come to Employee Wage computation");
        int day = 0;
        while (total_hours < max_working_hours && day <= working_day_per_month) {
            int checkRandom = (int) Math.floor(Math.random() * 10) % 3;
            switch (checkRandom) {
                case 1:
                    if (total_hours + full_day_hours < max_working_hours) {
                        System.out.println("Employee is present and day of month: " + day++);
                        wage = wage_per_hour * full_day_hours;
                        total_wage = total_wage + wage;
                        total_hours = total_hours + full_day_hours;
                    }
                    break;
                case 2:
                    if (total_hours + part_time_hours < max_working_hours) {
                        System.out.println("Employee is part time present and day of month: " + day++);
                        wage = wage_per_hour * part_time_hours;
                        total_wage = total_wage + wage;
                        total_hours = total_hours + part_time_hours;
                    }
                    break;
                default:
                    System.out.println("Employee is absent and day of month: " + day++);
                    break;

            }

        }
        System.out.println("Total Hours: " + total_hours);
        System.out.println("Month Employee Wage: " + total_wage);
    }
}