package org.framework.xcode.spring;

import java.text.MessageFormat;
import java.util.Locale;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

public class MessageResourceReplacer extends org.springframework.context.support.AbstractMessageSource implements ResourceLoaderAware{

	@Override
	public void setResourceLoader(ResourceLoader arg0) {
		
	}

	@Override
	protected MessageFormat resolveCode(String arg0, Locale arg1) {
		
		return null;
	}

}
