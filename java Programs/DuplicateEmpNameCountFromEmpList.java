package ttsttsts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employ {
	String id;
	String name;
	String dept;
	int age;
	
	
	public Employ(String id, String name, String dept, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
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
	@Override
	public String toString() {
		return "Employ [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}
	
	
}

public class DuplicateEmpNameCountFromEmpList {
	public static void main(String[] args) {
		List<Employ> emplist = new ArrayList<>();
		emplist.add(new Employ("E4002","Jack","IT",36));
		emplist.add(new Employ("E4003","Arjun","Comp",28));
		emplist.add(new Employ("E4004","Mahesh","Extx",28));
		emplist.add(new Employ("E4005","Arjun","Civil",25));
		emplist.add(new Employ("E4001","Sanjay","Mech",26));
		
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(Employ e :emplist) {
			if(!map.containsKey(e.getName()))
			{
				map.put(e.getName(),1);
			}
			else {
				map.put(e.getName(), map.get(e.getName())+1);
			}
				
		}
		System.out.println(map);
		
	}
	
	
	
}
