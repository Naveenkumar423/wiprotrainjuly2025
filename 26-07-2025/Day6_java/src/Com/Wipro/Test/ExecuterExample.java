package Com.Wipro.Test;

import Com.Wipro.Threads.NumberTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterExample {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);

		for (int i = 1; i <= 5; i++) {
			NumberTask task = new NumberTask("Task-" + i);
			executor.submit(task);
		}

		executor.shutdown();
	}
}
