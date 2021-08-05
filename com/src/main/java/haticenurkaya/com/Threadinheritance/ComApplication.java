package haticenurkaya.com.Threadinheritance;

import haticenurkaya.com.Threadinheritance.threadinheritance.Example;
import haticenurkaya.com.Threadinheritance.threadinheritance.Forms;

public class ComApplication {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
		 Example example = new Example("HNK");
		      example.start();
		}
	        Forms forms = new Forms(10);
	        forms.start();
		 
	
	   
	       
		
}

}
