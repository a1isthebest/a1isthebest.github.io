
public class Ramdom extends Thread{
	public void run() {	
		int randomNumber = 0;
		do {
			randomNumber = (int) (Math.random() * 100 + 1);
			System.out.printf("%d\n", randomNumber);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException ex){
				ex.printStackTrace();
			}
		} while (true);
	}
}
