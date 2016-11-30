package com.example.commands;

import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliAvailabilityIndicator;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.stereotype.Component;
@Component
public class EchoCommand implements CommandMarker{
	
	@CliAvailabilityIndicator(value="echo")
	public boolean isPrintCommandAvailable()
	{
		return Boolean.TRUE;
	}
	
	@CliCommand(value="echo",help="print welcome message")
	public String printMessage(@CliOption(mandatory=true,help="Enter your Name", key = { "name" }) final String name,
			                  @CliOption(key = { "time" }, mandatory = false, specifiedDefaultValue="now", help = "When you are saying") final String time)
	{
		return "Welcome "+name+" !"+" at "+time;
	}
}