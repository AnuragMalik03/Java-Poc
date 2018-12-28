package designPattern;

public class MySingleton {

	private static MySingleton singleObj;
	
	/*static {
		singleObj = new MySingleton();
	}*/
	
	public static MySingleton getInstance() {
		if(singleObj == null) singleObj = new MySingleton();
		
		return singleObj;
	}
	public static void main (String args[]) {
		
		MySingleton mys = MySingleton.getInstance();
		
		MySingleton mys2 = MySingleton.getInstance();
		
		System.out.println(mys);
		System.out.println(mys2);
		
		
	}
}
