package haticenurkaya.com.Threadinheritance.threadinheritance;

public class Forms extends Thread {
	private int index = 0;

	public Forms(int index) {
		this.index = index;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Çalışıyor : " + this.index);
			} catch (InterruptedException e) {
				System.out.println(getName() + " Durduruldu");
			}

		}
	}
}
