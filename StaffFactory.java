/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stafffactory;
import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class StaffFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner input =new Scanner (System.in);
        memberFactory MemberName=new memberFactory();
        System.out.println("Enter your member factory :");
        String member=input.next();
        System.out.println("Enter your works of hour:");
        int worksHour =input.nextInt();
        staff s =MemberName.getmemberFactory(member);
        s.getsalary(worksHour);
    }
    
}
