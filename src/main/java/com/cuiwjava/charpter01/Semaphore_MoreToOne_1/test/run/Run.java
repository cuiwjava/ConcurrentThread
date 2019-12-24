package com.cuiwjava.charpter01.Semaphore_MoreToOne_1.test.run;


import com.cuiwjava.charpter01.Semaphore_MoreToOne_1.extthread.MyThread;
import com.cuiwjava.charpter01.Semaphore_MoreToOne_1.service.Service;

public class Run {

	public static void main(String[] args) {
		Service service = new Service();

		MyThread[] threadArray = new MyThread[12];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyThread(service);
			threadArray[i].start();
		}
	}

}
