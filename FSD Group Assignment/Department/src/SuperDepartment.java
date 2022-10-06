
public class SuperDepartment {

	public String departmentName() {
		System.out.println("Super Department");
		return null;
	}
	public String getTodaysWork() {
		System.out.println("No Work as of now.");
		return null;
	}
	public String getWorkDeadline() {
		System.out.println("Nil");
		return null;
	}
	public String isTodayAHoliday() {
		System.out.println("Today is not a Holiday.");
		return null;
	}
}

class AdminDepartment extends SuperDepartment{
	
	public String departmentName() {
		System.out.println("Welcome to Admin Department!");
		return null;
	}
	public String getTodaysWork() {
		System.out.println("Complete your documents submission.");
		return null;
	}
	public String getWorkDeadline() {
		System.out.println("Complete by EOD.");
		return null;
	}
}

class HRDepartment extends SuperDepartment{
	
	public String departmentName() {
		System.out.println("Welcome to HR Department!");
		return null;
	}
	public String getTodaysWork() {
		System.out.println("Fill today's timesheet and mark your attendance.");
		return null;
	}
	public String getWorkDeadline() {
		System.out.println("Complete by EOD.");
		return null;
	}
	public String doActivity() {
		System.out.println("Team Lunch.");
		return null;
	}
}

class TechDepartment extends SuperDepartment{
	
	public String departmentName() {
		System.out.println("Welcome to Tech Department!");
		return null;
	}
	public String getTodayswork() {
		System.out.println("Complete Coding of Module 1.");
		return null;
	}
	public String getWorkDeadline() {
		System.out.println("Complete by EOD.");
		return null;
	}
	public String getTechStackInformation() {
		System.out.println("core JAVA.");
		return null;
	}
}


 