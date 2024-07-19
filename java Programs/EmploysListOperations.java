package ttsttsts;

/*
1. Find Frequency of Name
2. Find Employees who's age between 35 - 70
3. 10th highest salary from Employees
4. Sort Employs by ID 
5. Find Employs List Who's name is Arjun
6. Find List of Departments
7. Group the Employees by Department
8. Group the Employees count department wise
9. Find the Employee who has highest salary of each Department
10. Find Employee who has Second highest salary
*/

/*
one2one -> we will use stream().map(Employe::getId) or getName or getDept or getAge
one2many -> we will use stream().flatMap(m -> m.getContacts.stream()) 
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employe {
	String id;
	String name;
	String dept;
	int age;
	double salary;
	public Employe(String id, String name, String dept, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + ", salary=" + salary + "]";
	}
}

public class EmploysListOperations {
	public static void main(String[] args) {
		List<Employe> emplist = new ArrayList<>();
		emplist.add(new Employe("E4001","Jack","IT",24,15400));
		emplist.add(new Employe("E4003","Arjun","Comp",19,184848));
		emplist.add(new Employe("E4002","Mahesh","Extx",28,58152));
		emplist.add(new Employe("E4004","Arjun","Civil",32,552152));
		emplist.add(new Employe("E4006","Ram","Mech",87,100000));
		emplist.add(new Employe("E4005","Laxman","Extx",65,78000));
		emplist.add(new Employe("E4007","Shyam","Civil",50,73010));
		emplist.add(new Employe("E4008","Krishna","Mech",90,20000));
		emplist.add(new Employe("E4009","Radhe","Extx",84,7900));
		emplist.add(new Employe("E4010","Vishnu","Civil",63,70003));
		emplist.add(new Employe("E4011","Luv","Mech",101,60000));
		emplist.add(new Employe("E4012","Kush","Mech",71,250000));
		emplist.add(new Employe("E4013","Chanakya","Extx",51,24500));
		emplist.add(new Employe("E4014","Karn","Civil",47,37800));
		emplist.add(new Employe("E4015","Bhishm","Mech",36,587906));

		//************  Find Frequency of Name ***************
		System.out.println("\n*********** Frequency of Employe's Name ****************\n");
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(Employe e :emplist) {
			if(!map.containsKey(e.getName()))
			{
				map.put(e.getName(),1);
			}
			else {
				map.put(e.getName(), map.get(e.getName())+1);
			}
				
		}
		System.out.println(map);
		

		//**************** Find Employees who's age between 35 - 70 *******************************
		System.out.println("\n*********** Employs who's age between 35 - 70 ****************\n");
		emplist.stream().filter(m-> m.getAge() >35 && m.getAge() < 70).forEach(System.out::println);
		
		
		//**************** 10th highest salary from Employees *******************************
		System.out.println("\n*********** 10th Highest Salary from Employs ****************\n");
		List<Employe> sortedSalary = emplist.stream()
		        .sorted(Comparator.comparing(Employe::getSalary).reversed()) // Sort by salary descending
		        .collect(Collectors.toList()); 					  // Collect the result into a list
		if(emplist.size()>=10) {
			Employe tenthHighest = sortedSalary.get(9);
			System.out.println("TenthHighestSalary : " + tenthHighest);		
		}
		else {
			System.out.println("Not enough employees to find the 10th highest salary.");
		}
		
		
		// *********** Sort Employs by ID ** We can sort on any feature just replace getName*************
		System.out.println("\n*********** Sort Employs by ID ****************\n");
		emplist.stream().sorted(Comparator.comparing(Employe::getId))
		 .forEach(System.out::println);
		
		
		// *********** Find Employs Who's name is Arjun ****************
		System.out.println("\n*********** Employs List Who's name is Arjun ****************\n");
		emplist.stream().filter(x-> x.getName().equals("Arjun")).forEach(System.out::println);
		
		
		//*********** Find List of Departments ********************************
		System.out.println("\n*********** List of Departments ****************\n");		
		List<String> deptList = emplist.stream().map(Employe::getDept).distinct().collect(Collectors.toList());
		System.out.println("List of Departments : "+deptList);
		Set<String> deptList1 = emplist.stream().map(Employe::getDept).collect(Collectors.toSet());
		System.out.println("List of Departments : "+deptList1);
		

		//*********** Group the Employees by Department ********************************
		System.out.println("\n*********** Departments wise Employees ****************\n");	
		System.out.println(emplist.stream().collect(Collectors.groupingBy(Employe::getDept)));
		
		
		//*********** Group the Employees count department wise ********************************
		System.out.println("\n*********** Employees count department wise ****************\n");	
		System.out.println(emplist.stream().collect(Collectors.groupingBy(Employe::getDept,Collectors.counting())));
		
		
		//********************** Find the Employee who has highest salary of each Department ****************************
		System.out.println("\n*********** Highest salary of each Department ****************\n");
		Map<String, Optional<Employe>> DeptHighSal = emplist.stream().collect(Collectors.groupingBy(Employe::getDept,
														Collectors.maxBy(Comparator.comparing(Employe::getSalary))));
		System.out.println(DeptHighSal);
		
		//********************** Find Employee who has Second highest salary ****************************
		System.out.println("\n*********** Employee who has Second highest salary ****************\n");
		Employe secondHighSalary = emplist.stream().sorted(Comparator.comparing(Employe::getSalary).reversed())
												   .skip(1).findFirst().get();
		System.out.println(secondHighSalary);
	}
	
}
