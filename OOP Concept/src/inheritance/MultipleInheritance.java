package inheritance;

public class MultipleInheritance {
	 C obj=new C();  
	   obj.msg();//Now which msg() method would be invoked?  
	}  
}

class A{  
	void msg(){
		System.out.println("Hello");
		}  
}  

class B{  
	void msg(){
		System.out.println("Welcome");
	}  
}  

class C extends A,B{//suppose if it were  
   
}