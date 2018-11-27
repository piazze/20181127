package test1;

/**
 * 类不能继承接口
 * 类只能够实现接口
 * @author Administrator
 *
 */
public class B implements C,D{

	@Override
	public void test1() {
		System.out.println("子类B重写了A接口中的test1方法");
	}

	@Override
	public void d() {
		System.out.println("子类B实现了D接口中的d方法");
	}

}
