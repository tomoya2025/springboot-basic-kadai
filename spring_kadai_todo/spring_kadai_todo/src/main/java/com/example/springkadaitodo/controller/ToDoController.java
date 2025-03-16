package com.example.springkadaitodo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springkadaitodo.service.ToDoService;

@Controller
public class ToDoController {
	private final ToDoService todoService;
	
	public ToDoController(ToDoService toDoService) {
		this.todoService = toDoService;
	}
	
	@GetMapping("/todo")
	public String ToDo(Model model) {
		model.addAttribute("todos", todoService.getAllToDo());
		return "todoView";
	}
}
