 //Q1  Encapsulation is process of combining data and function into single unit called class.
 // in Encapsulation data is not accessed directrly it can be accessed  by functions present inside the class . it is used for
  //purpose of data hiding e.g.
     /* import java .util.*;
	class Encap{
	public static void main(String args[])
	{
	System.out.println("This is encap");
	Scanner sc = new Scanner (System.in);
	System.out.println(" enter password");
	String password = sc.nextLine();
	UserData objUD=new UserData();
	System.out.println("value of id in UserData="+ objUD .getID(password));
	
	}
	}
	class UserData{
	private String password ="Simran";
	private int id =10;
	int getID(String passoword){
	if (checkpassword(password)){
	return id;
	}
	return 0;
	}
	
	}
	private boolean checkpassword(String password){
	return this.password.equals(password);
	}
	}/*
	
     
  
  
  
  
  //Q2 polymorphism means having the different functions of same name in one class where poly means namy amd morphism means forms.
  it is of two types 1. overloading 2.overriding
   /*class Student{
    String name;
    int age;
    public void infoDisplay(String name)
    {
        System.out.println(name);
    }
    public void infoDisplay(int age){
        System.out.println(age);
    }
    public void infoDisplay(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }
}
class Room{
    public static void main(String[] args) {
        Student as= new Student();
        as . name="Simran";
        as.age=24;
        as .infoDisplay( as.name,as.age);
       } 
        
    }/*

    Q3
	//Packages in are group of similar types of classes or sub pacakages . packages can be built in or user defined .
	//built in packages are java,util,ios,Scanner etc.
	  
   //	  Final keyword is used to make the value of some variable or method unchangeable e.group
      //
//	  class Test{
	//	public static void main(String [] args){
		//final int i;
		//i=20;
		//System.out.println(i);
	//	}
	//	}
//		Output : 20
	  
	  
	/* Q5 
 class Test3{
  public static void main(String args[]){
   int n=3;
   for(int i=1; i<=n;i++){
	   for(int j=1;j<=n-i;j++){
   
      System.out.print(" ");
   }
   for(int j=1;j<=i;j++){
   System.out.print("1");
   }
   for(int j=1;j<=i-1;j++){  // to print in odd sequence we need this extra loop..
	   System.out.print("1");
   }
   System.out.println();
   
   }
   }
   }/*
   Q4
    class Rectangle{
	static void area(int length){
	int length= 5;
	}
	
	void circumference(){
	int breadth;
	System.out.println("Breath is ="+breadth);
	}
	}
	class Shape extends Rectangle{
	public static void main(String []args){
	area();
	Rectangle obj = new Rectangle();
	obj.breadth;
	}
	}
   
   