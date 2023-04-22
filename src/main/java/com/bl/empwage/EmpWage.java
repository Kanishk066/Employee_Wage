package com.bl.empwage;

import java.util.ArrayList;

class EmployeeWageCalculator {
    final int PART_TIME_HOUR = 4;
    final int FULL_DAY_HOUR = 8;
    int totalWorkingDays;
    int totalWorkingHours;
    int monthlyWage;
    String company;
    int wagePerHour;
    int numWorkingDays;
    int maxWorkingHours;
    int totalWage;
    public EmployeeWageCalculator(String company, int wagePerHour, int numWorkingDays, int maxWorkingHours){
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.numWorkingDays = numWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }
    public int calculateWage() {
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
        totalWage += monthlyWage;
        return monthlyWage;
    }
    public String getCompany() {
        return company;
    }
    public int getTotalWage() {
        return totalWage;
    }
}
 class CompanyEmpWage {
    final String company;
    final int wagePerHour;
    final int numWorkingDays;
    final int maxWorkingHours;
    int totalWage;

    public CompanyEmpWage(String company, int wagePerHour, int numWorkingDays, int maxWorkingHours) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.numWorkingDays = numWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    public int getTotalWage() {
        return totalWage;
    }

    public String getCompany() {
        return company;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public int getNumWorkingDays() {
        return numWorkingDays;
    }

    public int getMaxWorkingHours() {
        return maxWorkingHours;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }
}
class EmpWageBuilder {
    CompanyEmpWage[] companies;
    int numCompanies;
    public EmpWageBuilder(){
        companies = new CompanyEmpWage[10];
    }
    public void addCompany(String company, int wagePerHour, int numWorkingDays, int maxWorkingHours){
        CompanyEmpWage emp = new CompanyEmpWage(company, wagePerHour, numWorkingDays, maxWorkingHours);
        companies[numCompanies++] = emp;
    }
    public void computeWages(){
        for (int i = 0; i < numCompanies; i++) {
            int wage = new EmployeeWageCalculator(companies[i].getCompany(), companies[i].getWagePerHour(), companies[i].getNumWorkingDays(), companies[i].getMaxWorkingHours()).calculateWage();
            companies[i].setTotalWage(wage);
            System.out.println("Total wage for " + companies[i].getCompany() +" is "+ companies[i].getTotalWage());
        }
    }
    }
public class EmpWage {
    public static void main(String[] args) {
             EmpWageBuilder empWageBuilder = new EmpWageBuilder();
             empWageBuilder.addCompany("Company A",  20, 20, 100);
             empWageBuilder.addCompany("Company B", 25,25, 120);
             empWageBuilder.computeWages();
    }
}
