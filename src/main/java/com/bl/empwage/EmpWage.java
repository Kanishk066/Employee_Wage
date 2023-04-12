package com.bl.empwage;
public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee Wage Project");

        // UC-1

            int a = (int)(Math.random() * 10) % 2;
            if (a == 1) {
                System.out.println("Employee is Present");
            }
                else {
                System.out.println("Employee is absent");
            }

//          UC-2

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

        // UC-3

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

        // UC-4

        switch (NewAttendance) {
            case 1 -> {
                dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                System.out.println("Employee is Part Time. Daily Wage = " + dailyWage);
            }
            case 2 -> {
                dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                System.out.println("Employee is Full Time. Daily Wage = " + dailyWage);
            }
            default -> System.out.println("Employee is Absent. Daily Wage = " + dailyWage);
        }

//         UC-5
        final int NUM_WORKING_DAYS = 20;
        int monthlyWage = 0;

        for (int i = 0; i < NUM_WORKING_DAYS; i++) {
             NewAttendance = (int) (Math.random() * 3); // 0 for absent, 1 for part-time, 2 for full-time
            dailyWage = switch (attendance) {
                case 1 -> WAGE_PER_HOUR * PART_TIME_HOUR;
                case 2 -> WAGE_PER_HOUR * FULL_DAY_HOUR;
                default -> 0;
            };
            monthlyWage += dailyWage;
        }
        System.out.println("Employee Monthly Wage = " + monthlyWage);

//        UC-6

         int MAX_WORKING_HOURS = 100;
         int totalWorkingDays = 0;
         int totalWorkingHours = 0;
         while (totalWorkingDays < NUM_WORKING_DAYS && totalWorkingHours < MAX_WORKING_HOURS) {
            NewAttendance = (int) (Math.random() * 3); // 0 for absent, 1 for part-time, 2 for full-time

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
