package com.bl.empwage;
public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee Wage Project");
        int NUM_WORKING_DAYS = 20;
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int PART_TIME_HOUR = 4;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;
        int dailyWage = 0;
        int monthlyWage = 0;
        int MAX_WORKING_HOURS = 100;
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        while (totalWorkingDays < NUM_WORKING_DAYS && totalWorkingHours < MAX_WORKING_HOURS) {
           int NewAttendance = (int) (Math.random() * 3); // 0 for absent, 1 for part-time, 2 for full-time
             switch (NewAttendance) {
                 case 1 -> {
                     dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                     totalWorkingHours += PART_TIME_HOUR;
                 }
                 case 2 -> {
                     dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                     totalWorkingHours += FULL_DAY_HOUR;
                 }
                 default -> dailyWage = 0;
             }
            totalWorkingDays++;
            monthlyWage += dailyWage;
        }
        System.out.println("Total Working Days = " + totalWorkingDays);
        System.out.println("Total Working Hours = " + totalWorkingHours);
        System.out.println("Employee Monthly Wage = " + monthlyWage);
    }
}
