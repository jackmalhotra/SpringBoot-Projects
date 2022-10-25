package RestApi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Course {
	@Id
	private int id;
	private String name;
	private String gender;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	
	}

	

}
