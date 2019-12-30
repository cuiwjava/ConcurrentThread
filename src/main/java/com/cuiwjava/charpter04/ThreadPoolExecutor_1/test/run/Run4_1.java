package com.cuiwjava.charpter04.ThreadPoolExecutor_1.test.run;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run4_1 {
	// ����ʹ��LinkedBlockingDeque��
	// �����߳�����>corePoolSizeʱ�������������������
	// ͬһʱ�����ֻ����7���߳�������
	// ����keepAliveTime>5ʱҲ����������߳�
	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println(Thread.currentThread().getName()
							+ " run!" + System.currentTimeMillis());
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		ThreadPoolExecutor executor = new ThreadPoolExecutor(7, 8, 5,
				TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		executor.execute(runnable);// 1
		executor.execute(runnable);// 2
		executor.execute(runnable);// 3
		executor.execute(runnable);// 4
		executor.execute(runnable);// 5
		executor.execute(runnable);// 6
		executor.execute(runnable);// 7
		executor.execute(runnable);// 8
		executor.execute(runnable);// 9
		Thread.sleep(300);
		System.out.println("A:" + executor.getCorePoolSize());
		System.out.println("A:" + executor.getPoolSize());
		System.out.println("A:" + executor.getQueue().size());
		Thread.sleep(10000);
		System.out.println("B:" + executor.getCorePoolSize());
		System.out.println("B:" + executor.getPoolSize());
		System.out.println("B:" + executor.getQueue().size());
	}
	// ͨ����ʵ����Ե�֪�����ʹ��LinkedBlockingDeque��Ϊ�������
	// �򲻹��߳���>corePoolSize����>maximumPoolSize
	// ���򶼿��Եõ���ȷ��������У����Ҳ�������쳣
	// ��ť�ʺ�ɫ����Ϊ���л����߳��ڵȴ�����
}
