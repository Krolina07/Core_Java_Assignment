package Assignment3;

public class ThrowInsideCatch {
	// Write a program with nested try blocks
	public ThrowInsideCatch() {
		try {
			main3();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void main3() throws Exception {
		try {
			main2();
		} catch (Exception e) {
			throw new Exception("Exception Main3", e);
		}
	}

	public void main2() throws Exception {
		try {
			main1();
		} catch (Exception e) {
			throw new Exception("Exception Main2", e);
		}
	}

	public void main1() throws Exception {

		throw new Exception("Exception Main1");
	}

	public static void main(String... args) {
		new ThrowInsideCatch();
	}
}
