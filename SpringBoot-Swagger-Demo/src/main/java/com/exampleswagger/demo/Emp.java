package com.exampleswagger.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swag/emp")
public class Emp {

	private class Em
	{
		private String ename;
		private Long sal;
		
		public Em(String ename, long sal) {
			this.ename = ename;
			this.sal = sal;
		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		public Long getSal() {
			return sal;
		}

		public void setSal(Long sal) {
			this.sal = sal;
		}
		
		
	}
	
	 @GetMapping 
	 public List<Em> getEm() 
	 { 
		 return Arrays.asList(new Em("Jack",100L),new Em("Robin",50L)); 
	 }
	
	@PostMapping
	public Em getEm(@RequestBody String ename , long sal)
	{
		return new Em(ename,sal);
	}
}
