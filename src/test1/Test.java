package test1;

public class Test {

	public static void main(String[] args) {
		//使用接口，能够更自然的实现多态
		A a = new B();   //父类类型保存子类的对象
		a.test1();
		a.test2();
		
		//System.out.println(a instanceof A);
		//System.out.println(a instanceof D);
		
		if (a instanceof D) {  //判断对象a是否是D的实现类
			D d = (D)a;   //将a强制类型转换为D
			d.d();
			//System.out.println(d == a);
		}
		
	}

}
