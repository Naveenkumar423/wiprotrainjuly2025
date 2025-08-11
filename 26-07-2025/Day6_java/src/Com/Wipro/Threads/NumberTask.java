package Com.Wipro.Threads;

public class NumberTask implements Runnable {
	private String taskName;

	public NumberTask(String taskName) {
		this.taskName = taskName;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(taskName + " - Number: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(taskName + " interrupted.");
			}
		}
		System.out.println(taskName + " completed.");
	}
}
