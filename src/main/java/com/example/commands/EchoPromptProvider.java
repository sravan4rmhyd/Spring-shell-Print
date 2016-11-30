package com.example.commands;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.PromptProvider;
import org.springframework.stereotype.Component;
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class EchoPromptProvider implements PromptProvider {

	@Override
	public String getProviderName() {
		return "Echo Prompt Provider";
	}

	@Override
	public String getPrompt() {
		return "print>";
	}

}
