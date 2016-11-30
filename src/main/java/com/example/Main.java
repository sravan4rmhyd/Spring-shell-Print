package com.example;

import java.io.IOException;

import org.springframework.shell.Bootstrap;
import org.springframework.stereotype.Component;

@Component
public class Main {

	public static void main(String[] args) throws IOException {
		Bootstrap.main(args);
	}
}