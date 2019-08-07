
public class ClaculatorImpl implements Calculator {

	@Override
	public int squre(int num) {
		// TODO Auto-generated method stub
		return num*num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c= num -> (num * num);
		
		System.out.println("Squre out put : "+c.squre(5));
		c.defaultMethod();
		Calculator.staticMetho();
		
	}

}
