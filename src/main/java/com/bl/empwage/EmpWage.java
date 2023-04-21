package com.bl.empwage;
class EmployeeWageCalculator {
    final int PART_TIME_HOUR = 4;
    final int FULL_DAY_HOUR = 8;
    int totalWorkingDays;
    int totalWorkingHours;
    int monthlyWage;

    public int caculateWage(String company, int wagePerHour, int numWorkingDays, int maxWorkingHours) {
        System.out.println("Calculating wage for company" + company);
        int dailyWage;
        while (totalWorkingDays < numWorkingDays && totalWorkingHours < maxWorkingHours) {
            int NewAttendance = (int) (Math.random() * 3); // 0 for absent, 1 for part-time, 2 for full-time
            switch (NewAttendance) {
                case 1 -> {
                    dailyWage = wagePerHour * PART_TIME_HOUR;
                    totalWorkingHours += PART_TIME_HOUR;
                }
                case 2 -> {
                    dailyWage = wagePerHour * FULL_DAY_HOUR;
                    totalWorkingHours += FULL_DAY_HOUR;
                }
                default -> dailyWage = 0;
            }
            totalWorkingDays++;
            monthlyWage += dailyWage;
        }
        return monthlyWage;
    }
}

public class EmpWage {
    public static void main(String[] args) {
             EmployeeWageCalculator companyA = new EmployeeWageCalculator();
             int wageA = companyA.caculateWage("Company A", 20, 20, 100);
             System.out.println("Monthly wage for company A: " + wageA);

             EmployeeWageCalculator companyB = new EmployeeWageCalculator();
             int wageB = companyB.caculateWage("Company B", 25, 25, 120);
             System.out.println("Monthly wage for Company B: " + wageB);
    }
}
