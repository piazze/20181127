package test1;

public class Demo {

	public int a = 10; //成员变量，实例变量
	
	//类变量，类变量通过static修饰
	public static int b = 10; //类变量
	
	//实例方法
	public void test1() {
		
	}

	/*类方法*/
	public static void test2() {
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		/*
		 * 实例变量的含义：
		 * 		通过对象名.属性访问的变量
		 * */
		Demo d = new Demo();
		d.a = 5;
		d.test1();
		
		//类变量可以通过类名.直接访问
		Demo.b = 5;
		Demo.test2();
		
	}
}
