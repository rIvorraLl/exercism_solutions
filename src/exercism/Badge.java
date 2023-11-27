package exercism;

class Badge {
    public String print(Integer id, String name, String department) {
	String employeeId = id != null ? "[" + id + "] - " : "";
	String employeeDepartment = department != null
		? department.toUpperCase()
		: "OWNER";

	return employeeId + name + " - " + employeeDepartment;
    }
}
