package ru.javamentor.SpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm SpringBoot application");
		messages.add("CRUD application is ready!");
		messages.add("Java version: " + System.getProperty("java.version"));
		model.addAttribute("messages", messages);
		return "index";
	}
}
