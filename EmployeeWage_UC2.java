package com.company;

public class EmployeeWage_UC2 {
    public static void main(String[] args) {

        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;

        int empCheck = (int)((Math.random())*10)%2;


    if (empCheck == 1) {
        empHrs = 8;
        System.out.println("employee present");
        }
    else {
        empHrs = 0;
        System.out.println("employee absent");
        }
    int empWage = empHrs * EMP_RATE_PER_HOUR;

        System.out.println("employee wages:" + empWage);

    }

}
