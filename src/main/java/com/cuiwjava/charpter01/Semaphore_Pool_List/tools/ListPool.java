package com.cuiwjava.charpter01.Semaphore_Pool_List.tools;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 若干个线程访问池子中的数据 同时只有一个线程可以获取数据 使用完毕后放回翅中
 */
public class ListPool {

	private int poolMaxSize = 5;
	private int semaphorePermits = 5;
	private List<String> list = new ArrayList<String>();
	private Semaphore concurrencySemaphore = new Semaphore(semaphorePermits);
	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public ListPool() {
		super();
		for (int i = 0; i < poolMaxSize; i++) {
			list.add("高洪岩" + (i + 1));
		}
	}

	public String get() {
		String getString = null;
		try {
			concurrencySemaphore.acquire();
			lock.lock();
			while (list.size() == 0) {
				condition.await();
			}
			getString = list.remove(0);
			lock.unlock();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return getString;
	}

	public void put(String stringValue) {
		lock.lock();
		list.add(stringValue);
		condition.signalAll();
		lock.unlock();
		concurrencySemaphore.release();
	}

}
