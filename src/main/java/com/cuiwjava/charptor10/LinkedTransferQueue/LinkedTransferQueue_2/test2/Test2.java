package com.cuiwjava.charptor10.LinkedTransferQueue.LinkedTransferQueue_2.test2;

public class Test2 {

	public static void main(String[] args) {
		try {
			MyServiceB service = new MyServiceB();

			ThreadB2 b = new ThreadB2(service);
			b.setName("b");
			b.start();

			Thread.sleep(3000);

			System.out.println("队列中的元素个数为:" + service.queue.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
