package printer;

import printer.inkbox.BlackInkBox;
import printer.inkbox.ColorInkBox;
import printer.inkbox.InkBox;
import printer.paper.A4Paper;
import printer.paper.B5Paper;
import printer.paper.Paper;

public class Client {
	public static void main(String[] args) {
		
		InkBox black = new BlackInkBox(); //黑色墨盒
		InkBox color = new ColorInkBox(); //彩色墨盒
		
		Paper a4 = new A4Paper();  //A4
		Paper b5 = new B5Paper();  //B5
		
		//实例化打印机
		Printer printer = new  HpPrinter(color, b5);
		
		printer.print("hello printer");
	}
}
