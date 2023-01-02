package inheritancejava;

public class inherit { 
	 int a, b; 
	 void display() 
	 { 
	 System.out.println(“Inside this class values =”+a+” +b"); 
	 } 
	} 
	class inheritB extends inherit 
	{ 
	 int c; 
	 void show() 
	 { 
	 System.out.println(“Inside Class B values=”+a+” “+b+” “+c);  } 
	} 
	class SingleInheritance 
	{ 
	 public static void main(String args[]) 
	{ 
	 inheritB obj=new inheritB(); 
	 obj.a=10; 
	 obj.b=20; 
	 obj.c=30; 
	 obj.display(); 
	 obj.show(); 
	 } 
	} 
}
