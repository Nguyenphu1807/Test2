/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestADF1;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public abstract class SalaryPolicy {
    public float baseSalary;
    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("BaseSalary is :");
        baseSalary = input();
    }
    public static void main(String[] args) {
        EmployeeFullTime c1 = new EmployeeFullTime();
        System.out.println("EmloyeeFulltime is : " + c1.getArea());
        EmployeePartime c2 = new EmployeePartime();
        System.out.println("EmployeePartime is :" + c2.getArea());
    }

    private float input() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
