package org.framework.xcode.nosql.redis.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * @author Songjian
 * 对象 <-> bytes[] 转换
 */
public class SerializeUtil {
	
	private final static Logger LOG = LoggerFactory.getLogger(SerializeUtil.class);
	
	
	public static byte[] serialize(Object object) {
		ObjectOutputStream oos = null;
		ByteArrayOutputStream baos = null;
		try {
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(object);
			oos.flush();
			byte[] bytes = baos.toByteArray();
			return bytes;
		} catch (Exception e) {
			LOG.error("SerializeUtil method serialize {}", e);
		}
		return null;
	}

	
	public static Object unserialize(byte[] bytes) {
		ByteArrayInputStream bais = null;
		try {
			bais = new ByteArrayInputStream(bytes);
			ObjectInputStream ois = new ObjectInputStream(bais);
			return ois.readObject();
		} catch (Exception e) {
			LOG.error("SerializeUtil method unserialize {}", e);
		}
		return null;
	}
	
}

