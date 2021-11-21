/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stafffactory;

/**
 *
 * @author Marco
 */
public class doctor implements staff
{
    int hour=34;
    @Override
    public void getsalary( int worksHour) {
        System.out.println("your salary is " + worksHour*hour);
    }

    @Override
    public void getYearsofwork() {
        
    }
    
}
