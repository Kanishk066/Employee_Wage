package com.bl.empwage;
public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee Wage Project");
            int a = (int)(Math.random() + 10) % 10;
            if (a == 1)
                System.out.println("Employee is Present");
            else
                System.out.println("Employee is absent");
    }
}
