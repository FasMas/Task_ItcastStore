package task_itcaststore.utils.ext;

/**
 * String拓展类
 * @noinspection unused
 */
public class StringExt {

	/**
	 * 判断字符串是否为Null。
	 */
	public static boolean isNull(String str){
		return str == null;
	}

	/**
	 * 判断字符串是否为Null、为空。
	 */
	public static boolean isEmpty(String str) {
		return str == null || str.equals("");
	}

	/**
	 * 判断字符串是否为Null、为空、为空格。
	 */
	public static boolean isSpace(String str){
		return str == null || str.trim().equals("");
	}
}
