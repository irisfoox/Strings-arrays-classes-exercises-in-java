package second;

public class Staff {
	private String name;
	private String id;
	private int bruSalary=1;
	private int taxPer=30;
	public float getNeto(int bruSalary) {
		return bruSalary*(100-taxPer)/100;
	}
	
	@Override
	public String toString() {
		return "Staff [name=" + name + ", id=" + id + ", brute Salary=" + bruSalary + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getBruSalary() {
		return bruSalary;
	}
	public void setBruSalary(int bruSalary) {
		this.bruSalary = bruSalary;
	}
	public int getTaxPer() {
		return taxPer;
	}
	public void setTaxPer(int taxPer) {
		this.taxPer = taxPer;
	}

	public Staff(String name, String id, int bruSalary) {
		
		this.name = name;
		this.id = id;
		this.bruSalary = bruSalary;
	}
	public Staff() {
		
	}
	
	
    
}
