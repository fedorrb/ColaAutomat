package home.work.queue;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class ColaAutomat {
	private ArrayDeque<String> queueList = new ArrayDeque<String>();

	public ColaAutomat() {
		super();
	}

	public void calcQueueList(int cup) {
		if (cup >= 0) {
			queueList.clear();
			queueList.addLast("Sheldon");
			queueList.addLast("Leonard");
			queueList.addLast("Volovitc");
			queueList.addLast("Kutrapalli");
			queueList.addLast("Penny");
			String str;
			for (int i = 0; i < cup; i++) {
				try {
					str = queueList.removeFirst();
					queueList.addLast(str);
					queueList.addLast(str);					
				} catch (NoSuchElementException e) {
					throw new NoSuchElementException("queueList is empty.");
				}
			}
		} else
			throw new IllegalArgumentException("Parameter 'cup' should be greater than zero.");
		System.out.println(queueList);
	}

	@Override
	public String toString() {
		return "ColaAutomat [queueList=" + queueList + "]";
	}

}
