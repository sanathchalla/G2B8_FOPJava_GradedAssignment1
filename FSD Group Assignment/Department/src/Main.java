
public class Main {
	public static void main(String[] args) {
		AdminDepartment a = new AdminDepartment();
		
		a.departmentName();
		System.out.println();
		a.getTodaysWork();
		a.getWorkDeadline();
		a.isTodayAHoliday();
		
		System.out.println();
		
		HRDepartment h = new HRDepartment();
		
		h.departmentName();
		System.out.println();
		h.getTodaysWork();
		h.getWorkDeadline();
		h.doActivity();
		h.isTodayAHoliday();
		
		System.out.println();
		
		TechDepartment t = new TechDepartment();
		
		t.departmentName();
		System.out.println();
		t.getTodayswork();
		t.getWorkDeadline();
	  t.getTechStackInformation();
	  t.isTodayAHoliday();
	}

}
