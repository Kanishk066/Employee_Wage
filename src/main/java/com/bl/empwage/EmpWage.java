package com.bl.empwage;
public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee Wage Project");
            int a = (int)(Math.random() * 10) % 2;
            if (a == 1)
                System.out.println("Employee is Present");
            else
                System.out.println("Employee is absent");

        int IS_PRESENT = 1;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;
        int dailyWage = 0;
        int attendance = (int) (Math.random() * 2); // 0 for absent, 1 for present
        if (attendance == IS_PRESENT) {
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee is Present. Daily Wage = " + dailyWage);
        } else {
            System.out.println("Employee is Absent. Daily Wage = " + dailyWage);
        }

        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int PART_TIME_HOUR = 4;
        int NewAttendance = (int) (Math.random() * 3);
        if (NewAttendance == IS_PART_TIME) {
            dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
            System.out.println("Employee is Part Time. Daily Wage = " + dailyWage);
        } else if (NewAttendance == IS_FULL_TIME) {
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee is Full Time. Daily Wage = " + dailyWage);
        } else {
            System.out.println("Employee is Absent. Daily Wage = " + dailyWage);
        }
    }
}
