package leetcode.test.Single;

//饿汉模式
public class Single2 {
	private Single2 instence = null;

	// 私有的构造方法
	private Single2() {

	}

	public Single2 getInstence() {
		if (instence == null) {
			instence = new Single2();
		}
		return instence;
	}
}
