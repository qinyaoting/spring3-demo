package org.framework.xcode.nosql.redis.util;



/**
 * @author Songjian
 * redis key生成策略
 */
public class RedisKeyMaker {

	public static String makeKey(Class<?> clazz, long id) {
		String tableName = clazz.getSimpleName();
		StringBuilder sb = new StringBuilder();
		sb.append(tableName);
		sb.append('_');
		sb.append(id);
		return sb.toString();
	}
	
	public static byte[] makeKey(String key) {
		return key.getBytes();
	}
	
}
