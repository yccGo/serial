package cn.edu.cust.adapter;

public class Adapter extends Adaptee implements Target{

	@Override
	public void test() {
		super.inputWord();
	}

}
