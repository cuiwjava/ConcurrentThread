package com.cuiwjava.charptor10.LinkedTransferQueue.LinkedTransferQueue_1.test1;

public class Test1 {
	public static void main(String[] args) {
		MyServiceA service = new MyServiceA();
		ThreadA a = new ThreadA(service);
		a.start();
	}
}
