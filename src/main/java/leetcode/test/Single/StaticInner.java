package leetcode.test.Single;

public class StaticInner {

	private static class StaticInnerHolder {
		private static final StaticInner instance = new StaticInner();
	}

	private StaticInner() {

	}

	public static StaticInner getInstance() {
		return StaticInnerHolder.instance;
	}
	// private Singleton() {}
	//
	// static class SingletonHolder {
	// private static final Singleton instance = new Singleton();
	// }
	//
	// public static Singleton getInstance() {
	// return SingletonHolder.instance;
	// }

}
