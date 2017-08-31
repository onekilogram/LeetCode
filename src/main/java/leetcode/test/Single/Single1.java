package leetcode.test.Single;

//懒汉模式
public class Single1 {
	
	private static Single1 instence = null;

	// 私有的构造方法
	private Single1() {

	}

	//静态内部类
	//private 
	public static Single1 getInstence() {
		if (instence == null) {
			synchronized (Single1.class) {
				if (instence == null) {
					instence = new Single1();
				}
			}
		}
		return instence;
	}
	// public synchronized static Single1 getInstence() {
	// if (instence == null) {
	// instence = new Single1();
	// }
	// return instence;
	// }
}
