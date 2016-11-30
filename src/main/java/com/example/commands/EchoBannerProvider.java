package com.example.commands;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.BannerProvider;
import org.springframework.shell.support.util.OsUtils;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class EchoBannerProvider implements BannerProvider {

	@Override
	public String getProviderName() {
		return "Welcome to Echo Banner";
	}

	@Override
	public String getBanner() {
		StringBuffer buf = new StringBuffer();
		buf.append("=======================================" + OsUtils.LINE_SEPARATOR);
		buf.append("*                                     *" + OsUtils.LINE_SEPARATOR);
		buf.append("*            ECHO Messages            *" +OsUtils.LINE_SEPARATOR);
		buf.append("*                                     *" + OsUtils.LINE_SEPARATOR);
		buf.append("=======================================" + OsUtils.LINE_SEPARATOR);
		buf.append("Version:" + this.getVersion());
		return buf.toString();
	}

	@Override
	public String getVersion() {
		return "1.0";
	}

	@Override
	public String getWelcomeMessage() {
		return "Welcome to Echo Messages";
	}

}
