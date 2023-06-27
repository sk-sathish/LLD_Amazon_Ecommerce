package helper;

public class UUIDGenerator {
	static int start = 10001;
	public static String generateNewUUID() {
		return String.valueOf(start++);
	}
}
