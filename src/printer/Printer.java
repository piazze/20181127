package printer;

import printer.inkbox.InkBox;
import printer.paper.Paper;

/**
 * 抽象的打印机
 * @author Administrator
 *
 */
public abstract class Printer {
	/*
	 * 打印机需要安装墨盒和纸张才才能工作
	 * */
	private InkBox box;  //墨盒
	
	private Paper paper; //纸张
	
	private String brand; //打印机品牌

	public InkBox getBox() {
		return box;
	}

	public void setBox(InkBox box) {
		this.box = box;
	}

	public Paper getPaper() {
		return paper;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * 没有提供无参构造方法
	 * 因为在现实中，打印机必须安装墨盒和纸张才能够工作
	 * @param box
	 * @param paper
	 * @param brand
	 */
	public Printer(InkBox box, Paper paper, String brand) {
		super();
		this.box = box;
		this.paper = paper;
		this.brand = brand;
	}
	
	/**
	 * 所有打印机都有打印的功能
	 * @param msg 要打印的数据
	 */
	public abstract void print(String msg);
	
}
