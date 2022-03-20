package com.greatlearning.department;

//Admin Department

public class AdminDepartment extends SuperDepartment    //Admin Department extending Super Department
{
	
	
	public String departmentName()
	{
	    String deptname="Welcome to Admin Department ";
	    return deptname;
	}
	
	
	public String getTodaysWork()
	{
		String todayswork="Complete your documents Submission";
		return todayswork;
	}
	
	
	public String getWorkDeadline()
	{
		String workdeadline="Complete by EOD ";
		return workdeadline;
	}
	

}
