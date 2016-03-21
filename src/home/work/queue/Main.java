package home.work.queue;

import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		ColaAutomat automat = new ColaAutomat();
		try {
			automat.calcQueueList(0);
			automat.calcQueueList(2);
			automat.calcQueueList(5);
			automat.calcQueueList(15);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}
}
