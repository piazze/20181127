package printer;

import printer.inkbox.InkBox;
import printer.paper.Paper;

/**
 * 惠普打印机
 * @author Administrator
 *
 */
public class HpPrinter extends Printer {

	private static final String BRAND = "惠普";
	
	public HpPrinter(InkBox box, Paper paper) {
		super(box, paper, BRAND);
	}

	@Override
	public void print(String msg) {
		System.out.println(BRAND + "打印机使用了" + super.getBox().getColor() + "墨盒在" + super.getPaper().getSize() + "打印了：");
		System.out.println(msg);
	}

}
