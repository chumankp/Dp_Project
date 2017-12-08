package som.singleton.thread;

import com.singlegton.beans.TimeStampLazy;

public class TimeZone implements Runnable{
	@Override
	public void run() {
		TimeStampLazy lazy=null;
		lazy = TimeStampLazy.getInstance();
		System.out.println(Thread.currentThread().getName()+": hase code"+lazy.hashCode());
	}
}
