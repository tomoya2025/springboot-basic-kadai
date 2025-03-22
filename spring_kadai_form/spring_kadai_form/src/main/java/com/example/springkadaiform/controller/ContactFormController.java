package com.example.springkadaiform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springkadaiform.form.ContactForm;

import jakarta.validation.Valid;

@Controller
public class ContactFormController {
	
	@GetMapping("/form")
	public String showForm(ContactForm contactForm){
		return "contactFormView";
	}
	
	@PostMapping("/confirm")
	public String confirmForm(@Valid ContactForm contactForm, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			return "contactFormView";
		}
		model.addAttribute("contactForm", contactForm);
		return "confirmView";
		
	}
}
