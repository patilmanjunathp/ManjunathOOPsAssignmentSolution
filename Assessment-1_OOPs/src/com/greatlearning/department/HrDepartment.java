package com.greatlearning.department;

//Hr Department

public class HrDepartment extends SuperDepartment     //Hr Department extending Super Department

{

	
	public String departmentName()
	{
		String deptname="Wecome to Hr Department";
		return deptname;
	}
	
	public String getTodaysWork()
	{
		String todayswork="Fill today’s worksheet and mark your attendance";
		return todayswork;
	}
	
	public String getWorkDeadline()
	{
		String workdeadline="Complete by EOD ";
		return workdeadline;
	}
	
	public String doActivity()
	{
		String activity="team Lunch";
		return activity;
	}
	

}
