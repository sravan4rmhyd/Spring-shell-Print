package com.example.commands;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.HistoryFileNameProvider;
import org.springframework.stereotype.Component;
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class EchoHistoryFileNameProvider implements HistoryFileNameProvider {

	@Override
	public String getProviderName() {
		return "Echo History File Provider";
	}

	@Override
	public String getHistoryFileName() {
		return "echo.log";
	}

}