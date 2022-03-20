package com.greatlearning.department;

//Tech Department

public class TechDepartment extends SuperDepartment     //Tech Department extending Super Department

{

	
	public String departmentName()
	{
		String deptname="Welcome to Tech Department ";
		return deptname;
	}
	
	public String getTodaysWork()
	{
		String todayswork="Complete coding of module 1";
		return todayswork;
	}
	
	public String getWorkDeadline()
	{
		String workdeadline="Complete by EOD ";
		return workdeadline;
	}
	
	public String getTechStackInformation()
	
	{
		String stackinformation="core Java";
		return stackinformation;
	}


}
