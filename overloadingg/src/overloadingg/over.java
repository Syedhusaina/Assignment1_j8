package overloadingg;

public class over {
	public void add() {
		int numberone=20;
		int numbertwo=20;
		System.out.println(numberone+numbertwo);	
	}
	public void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	public void add(int num1, int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
	public over() {
		
	}
	public static void main (String[] args) {
		over load=new over();
		load.add();
		load.add(5,10);
		load.add(1,89,90);
	}

}
