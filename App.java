package com.univ;

import java.util.Scanner;

import com.univ.impl.EmployeeImpl;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
       EmployeeImpl empImpl=new EmployeeImpl();
       System.out.println();
       System.out.println("\t\t Employee Operations");
       System.out.println("\t***************************************");
       System.out.println("\t\t 1.Create");
       System.out.println("\t\t 2.Read");
       System.out.println("\t\t 3.Update");
       System.out.println("\t\t 4.Delete By Id");
       System.out.println("\t\t 5.Delete All");
       System.out.println("\t\t 6.Exit");
       System.out.println("\t------------------------------------------");
       System.out.println();
       System.out.println("\t\t Enter Choice");
       
       int userChoice=sc.nextInt();
       if(userChoice>0)
       {
    	   do {
    		   switch(userChoice)
    		   {
    		   case 1: 
    			   empImpl.createEmp();
    			   break;
    			   
    		   case 2: 
    			   empImpl.readEmp();
    		   		break;
    		   
    		   case 3: 
    			   empImpl.updateEmp();
    		   		break;
    		   
    		   case 4: 
    			   empImpl.deleteByIdEmp();
    		   		break;
    		   
    		   case 5: 
    			   empImpl.deleteAllEmp();
    		   		break;
    		   
    		   case 6: 
    			   System.out.println();
    			   System.out.println("\t\t\t**********Thank You..!!***Visit Again**********");
    			   System.exit(0);
    		   		break;
    			   
    			   default:
    				   throw new IllegalArgumentException("Unexpected Value: "+ userChoice);
    		   }
    	   }while(userChoice!=6);
    	   
    		   
    	   
       }
       else 
       {
    	   System.out.println();
    	   System.out.println("\t User choice must be greater than 0 or positive number");
    	   
       }
       
       sc.close();
       
       
    }
}
