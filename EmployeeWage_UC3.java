package com.company;

public class EmployeeWage_UC3 {
    public static void main(String[] args) {

        int EMP_RATE_PER_HOUR = 20;
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int empHrs = 0;

        int empCheck = (int)((Math.random())*10)%3;

            if(empCheck == IS_FULL_TIME){
                empHrs = 8;
                System.out.println("employee present");
            }
            else if(empCheck == IS_PART_TIME){
                empHrs = 4;
                System.out.println("employee present half day");
            }
            else {
                empHrs = 0;
                System.out.println("employee absent");
            }
        int empWage = empHrs*EMP_RATE_PER_HOUR;

        System.out.println("employee wages:" +empWage);


    }
}


