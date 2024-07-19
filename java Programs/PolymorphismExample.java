package ttsttsts;

class Numbers_Sum { 
    //add method : takes two int parameters
    public int add(int val1, int val2)  { 
        return (val1 + val2); 
    } 
   
    // overloaded add : takes three int parameters
    public int add(int val1, int val2, int val3)  { 
        return (val1 + val2 + val3); 
    } 
   
    //overloaded add: takes two double parameters
    public double add(double val1, double val2)  { 
        return (val1 + val2); 
    } 
}
 
class PolymorphismExample{
    public static void main(String args[])   { 
        //create an object of Numbers_Sum class and call overloaded functions 
        Numbers_Sum numsum = new Numbers_Sum(); 
        System.out.println("Polymorphism in Java");
        System.out.println("add(int, int): " + numsum.add(15, 18)); 
        System.out.println("add(int, int, int): " + numsum.add(5, 10, 20)); 
        System.out.println("add(double,double): " + numsum.add(5.5, 15.5)); 
    } 
}