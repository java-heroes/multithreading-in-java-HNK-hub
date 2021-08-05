package haticenurkaya.com.Threadinheritance.threadinheritance;

public class Example extends Thread {

	private String index ;
	
	public Example(String index) {
		this.index = index;
	}
	
	public void run() {
		System.out.println("Form Dolduruluyor : " + this.index );
	}
}
