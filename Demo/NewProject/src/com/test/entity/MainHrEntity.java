package com.test.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
@Entity

public class MainHrEntity {
	@Id  long TimeStamp;
	@Index String Name;
	@Index float Emp_Salary;
	@Index float Absent;
	@Index String MonthName;
	@Index float TotalDays;
	@Index float Nwd;
	@Index float WorkingDays;
	@Index float WorkedMin;
	@Index float TotalWorkedDone;
	@Index float Sh_Ot;
	@Index float Sh_OtDays;
	@Index float Utilise;
	@Index float PresentDays;
	@Index  float Salary;
	@Index float Advance;
	@Index float ActualSalary;
	public MainHrEntity(long timeStamp,String name,float emp_Salary, float absent,String monthName, float totalDays, float nwd, float workingDays,
			float workedMin,float  totalWorkedDone, float sh_Ot, float sh_OtDays, float utilise,
			float presentDays, float salary, float advance, float actualSalary) {
		super();
		TimeStamp = timeStamp;
		Name = name;
		Emp_Salary=emp_Salary;
		Absent=absent;
		MonthName =monthName;
		TotalDays = totalDays;
		Nwd = nwd;
		WorkingDays = workingDays;
		WorkedMin = workedMin;
		TotalWorkedDone =totalWorkedDone;
		Sh_Ot = sh_Ot;
		Sh_OtDays = sh_OtDays;
		Utilise = utilise;
		PresentDays = presentDays;
		Salary = salary;
		Advance = advance;
		ActualSalary = actualSalary;
	}
	public MainHrEntity() {
		super();
	}
	public long  getTimeStamp() {
		return TimeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		TimeStamp = timeStamp;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public float getEmp_Salary(){
		return Emp_Salary;
	}
	public void setEmp_Salary(float emp_Salary){
		
		Emp_Salary = emp_Salary;
	}
	
	

public float getAbsent() {
	return Absent;
}
public void setAbsent(float absent) {
   Absent = absent;
}
	public String getMonthName() {
		return MonthName;
	}
	public void setMonthName(String monthName) {
		MonthName = monthName;
	}
	public float getTotalDays() {
		return TotalDays;
	}
	public void setTotalDays(float totalDays) {
		TotalDays = totalDays;
	}
	public float getNwd() {
		return Nwd;
	}
	public void setNwd(float nwd) {
		Nwd = nwd;
	}
	public float getWorkingDays() {
		return WorkingDays;
	}
	public void setWorkingDays(float workingDays) {
		WorkingDays = workingDays;
	}
	public float getWorkedMin() {
		return WorkedMin;
	}
	public void setWorkedMin(float workedMin) {
		WorkedMin = workedMin;
	}
	public float getTotalWorkedDone() {
		return TotalWorkedDone;
	}
	public void settotalWorkedDone(float totalWorkedDone) {
		TotalWorkedDone =totalWorkedDone;
	}
	public float getSh_Ot() {
		return Sh_Ot;
	}
	public void setSh_Ot(float sh_Ot) {
		Sh_Ot = sh_Ot;
	}
	public float getSh_OtDays() {
		return Sh_OtDays;
	}
	public void setSh_OtDays(float sh_OtDays) {
		Sh_OtDays = sh_OtDays;
	}
	public float getUtilise() {
		return Utilise;
	}
	public void setUtilise(float utilise) {
		Utilise = utilise;
	}
	public float getPresentDays() {
		return PresentDays;
	}
	public void setPresentDays(float presentDays) {
		PresentDays = presentDays;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	public float getAdvance() {
		return Advance;
	}
	public void setAdvance(float advance) {
		Advance = advance;
	}
	public float getActualSalary() {
		return ActualSalary;
	}
	public void setActualSalary(float actualSalary) {
		ActualSalary = actualSalary;
	}
	
	
}
