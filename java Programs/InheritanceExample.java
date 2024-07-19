package ttsttsts;

//base class
class Employee{  
 float salary=50000;  
}

//derived class
class Developer extends Employee{  
 int bonus=20000; 
}

class InheritanceExample{
 public static void main(String args[]){  
    //declare Developer class object and access properties of base and derived class
   Developer p=new Developer();  
   System.out.println("Inheritance in Java");
   System.out.println("Developer salary: "+p.salary);  
   System.out.println("Bonus declared for Developer: "+p.bonus);  
   System.out.println("Developer Total Earnings: " + (p.salary + p.bonus));
}  
}  

