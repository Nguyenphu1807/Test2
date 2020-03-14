/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestADF1;



/**
 *
 * @author MyPC
 */
public class EmployeeFullTime extends SalaryPolicy{
    public float rate;

    public EmployeeFullTime() {
    }

    public EmployeeFullTime(float rate) {
        this.rate = 4;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
    
    public double getArea() {
     return rate*baseSalary;

    }
}
