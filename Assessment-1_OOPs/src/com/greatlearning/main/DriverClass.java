package com.greatlearning.main;

import com.greatlearning.department.AdminDepartment;
import com.greatlearning.department.HrDepartment;
import com.greatlearning.department.TechDepartment;

//Driver Class

public class DriverClass 
{
	
 public static void main(String[] args)
 {
	 
	AdminDepartment admin=new AdminDepartment();   //Creating object for Admin department
	
	HrDepartment hr=new HrDepartment();            //Creating object for Hr department
	
	TechDepartment tech =new TechDepartment();     //Creating object for Tech department
	

System.out.println(admin.departmentName());        // Display Admin Department functionalities
System.out.println(admin.getTodaysWork());
System.out.println(admin.getWorkDeadline());
System.out.println(admin.isTodayAHoliday());                                              
System.out.println();


System.out.println(hr.departmentName());          // Display Hr Department functionalities
System.out.println(hr.doActivity());          
System.out.println(hr.getTodaysWork());
System.out.println(hr.getWorkDeadline());
System.out.println(hr.isTodayAHoliday());
System.out.println();


System.out.println(tech.departmentName());         // Display Tech Department functionalities
System.out.println(tech.getTodaysWork());
System.out.println(tech.getWorkDeadline());
System.out.println(tech.getTechStackInformation());
System.out.println(tech.isTodayAHoliday());


}

}
