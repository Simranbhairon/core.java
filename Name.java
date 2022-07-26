  // SIMRAN
  // Q2  - .class name = class MyWorld { ....}  , .function name = myWorld() , variable = int a; or int a =2; , 
     //  static variable = public static void main()
	
// Q 3 1) .java file = it is the file that is stored in the form of  source code and not compiled.
           //.classfile	 = it is the complied file that is going to be executed and generates the output.
//    2)  java is  not a complete  object  orirnted programming language as it has primitive data types i.e. int ,float etc.  
   //  3)  NR WA  =   void sum(int a ,int b)
     //                    {   int c= a+b;
	 //                      System.out.println (c); }

// Q5      Wrapper classes =  wrapper classes are used 
                   // e.g. Integer , Float etc.


 // Q 1 
  class Name{
	  
	   public static void main(String args[])
   {   
   Name  obj = new Name();
   obj .Hobby();
        System.out.println( "SIMRAN");
	    System.out.println(" 19");
	  
	 }
	 void Hobby(){
		 System.out.println("my Hobby is Calligraphy");
    }
  }
   
   // Q 4  
    class Calci{
		public  void Functions(){
			
		 static int addy(int a, int b) {
			 int c =   a+b;
			 System.out.println(" Sum of a and b =" + c);
		} 
		 static int subby( int d , int e){
			 int  f = d-e;
			 System.out.println(" difference is =" +f);
		 }
		 int diviji(int g , int h){
			 int i = g/h;
			 System.out .println("Division is ="+i);
		 }
		 int mull(int j ,int k){
			 int l =j*h;
			 System.out.println(" multiply  is ="+l);
		 }
	}
	class CalciWorking{
		public static void main (String args[])
		{  
		 Calci obj = new Calci();
		obj . Calci ();
		obj.addy(10,20);
		obj.subby(5,3);
		obj.diviji( 10,2);
		obj.mull( 2, 5);
		}
	   }
	
			
			 
			 
		 
		 
   
	 
   