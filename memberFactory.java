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
public class memberFactory 
{
    
public staff getmemberFactory (String memberOfFactory)
    {
        if(memberOfFactory==null)
           {
               return null ;
           }
        if(memberOfFactory.equalsIgnoreCase("doctor"))
           {
              return new doctor();

           }
        else if(memberOfFactory.equalsIgnoreCase("TeacchingAssistant"))        
            {
                return new TeachingAssistant();
            }
        else
            return null;
       
       
       
    }    
}
