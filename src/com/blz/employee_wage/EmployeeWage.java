package com.blz.employee_wage;

public class EmployeeWage {
    static final int isPresent = 1;
    static final int isPartime_present = 2;
    private String comapy_Name;
    private  int max_working_hours;
    private  int wage_per_hour;
    private  int working_day_per_month;

    public EmployeeWage(String comapy_Name, int max_working_hours, int wage_per_hour, int working_day_per_month) {
        this.comapy_Name = comapy_Name;
        this.max_working_hours = max_working_hours;
        this.wage_per_hour = wage_per_hour;
        this.working_day_per_month = working_day_per_month;
    }

    public static void main(String[] args) {
        System.out.println("Well come to Employee Wage computation");
        EmployeeWage company1 = new EmployeeWage("Google",50,30,25);
        System.out.println("employee wage of company "+company1.comapy_Name+ " is: "+company1.employee_Wage());

        EmployeeWage company2 =  new EmployeeWage("microsoft",80,25,30);
        System.out.println("employee wage of company "+company2.comapy_Name+ " is: "+company2.employee_Wage());
    }

    public  int employee_Wage() {
        int day = 0;
        int total_hours = 0;
        int full_day_hours = 8;
        int part_time_hours = 4;
        int wage = 0;
        int  total_wage = 0;
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

        return total_wage;
    }
}