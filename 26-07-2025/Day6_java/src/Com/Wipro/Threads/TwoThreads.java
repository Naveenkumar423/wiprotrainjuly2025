package Com.Wipro.Threads;

class NumberPrinter extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Number: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Number thread interrupted.");
			}
		}
	}
}

class AlphabetPrinter extends Thread {

	public void run() {
		for (char ch = 'A'; ch <= 'J'; ch++) {
			System.out.println("Alphabet: " + ch);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Alphabet thread interrupted.");
			}
		}
	}
}

public class TwoThreads {
	public static void main(String[] args) {
		NumberPrinter numberThread = new NumberPrinter();
		AlphabetPrinter alphabetThread = new AlphabetPrinter();

		numberThread.start();
		alphabetThread.start();
	}
}
