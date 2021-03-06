package view;

import controller.ThreadPrint;

public class Main {

	public static void main(String[] args) {

		for (int j = 0; j < 5; j++) {
			ThreadPrint tp = new ThreadPrint();
			tp.start();
		}
	
	}

}
