package com.cuiwjava.charptor10.LinkedTransferQueue.LinkedTransferQueue_4.test2;

public class ThreadB1 extends Thread {

	private MyServiceB service;

	public ThreadB1(MyServiceB service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " beginA "
				+ System.currentTimeMillis());
		System.out.println("tryTransfer(e) 返回值是"
				+ service.queue.tryTransfer("我是数据"));
		/**
		 * 如果当前存在一个正在等待获取的消费者线程 使用此方法会立即传输数据
		 * 否则 如果不存在 则返回false 并且数据不放入队列中 执行效果是不阻塞的
		 */
		System.out.println(Thread.currentThread().getName() + "   endA "
				+ System.currentTimeMillis());
	}

}
