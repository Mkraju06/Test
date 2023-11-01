
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello");
		
		Methods object = new Methods();
		
		object.HelloWorld();
		object.ByeWorld();
		
	}

	public void HelloWorld() {
		
		System.out.println("Hello World");
		
		
	}

	
	public void ByeWorld() {
		
		try {
			System.out.println("bye");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		System.out.println("Bye WOrld");
	}
	
}
