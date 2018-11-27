package test1;

/**
 * 接口A
 * @author Administrator
 *
 */
public interface A {
	public String STR = "hello";
	
	/**
	 * 抽象方法
	 */
	public void test1();
	
	/**
	 * 默认方法
	 */
	default void test2() {
		System.out.println("这是A接口的默认方法");
	}
}
