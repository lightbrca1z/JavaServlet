package model;

import java.util.List;

import bean.Employee;

public class SelectEmployees2 {

    public static void main(String[] args) {
		EmployeesDAO empDAO = new EmployeesDAO();
		List<Employee> empList = empDAO.findAll();
		
		for(Employee emp : empList) {
			System.out.println("ID : " + emp.getId());
			System.out.println("名前 : " + emp.getName());
			System.out.println("年齢 : " + emp.getAge() + "\n");
		}
    }
}
