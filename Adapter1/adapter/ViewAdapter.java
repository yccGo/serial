package cn.edu.cust.adapter;

public class ViewAdapter {
	public static void main(String[] args) {		
		Client client = new Client();
		Target target = new Adapter();
		client.requestData(target);
	}
}
