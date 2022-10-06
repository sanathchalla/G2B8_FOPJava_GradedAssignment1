package alldepartments;

public class SuperDepartment {
	public String departmentName() {
		return "Super Department";
	}
	public String getTodaysWork() {
		return "No Work as of now";
	}
	public String getWorkDeadline() {
		return "Nil";
	}
	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}
}

class AdminDepartment extends SuperDepartment{
	
	public String departmentName() {
		return "Admin Department";
	}
	public String getTodaysWork() {
		return "Complete your documents submission";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}

class HRDepartment extends SuperDepartment{
	
	public String departmentName() {
		return "HR Department";
	}
	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String doActivity() {
		return "Team Lunch";
	}
}

class TechDepartment extends SuperDepartment{
	
	public String departmentName() {
		return "Tech Department";
	}
	public String getTodayswork() {
		return "Complete Coding of Module 1";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String getTechStackInformation() {
		return "core JAVA";
	}



	public static void main(String[] args) {
		AdminDepartment a = new AdminDepartment();
		a.departmentName();
		a.getTodaysWork();
		a.getWorkDeadline();
		
		HRDepartment h = new HRDepartment();
		h.departmentName();
		h.getTodaysWork();
		h.getWorkDeadline();
		h.doActivity();
		
		TechDepartment t = new TechDepartment();
		t.departmentName();
		t.getTodayswork();
		t.getWorkDeadline();
		t.getTechStackInformation();
	}
}

