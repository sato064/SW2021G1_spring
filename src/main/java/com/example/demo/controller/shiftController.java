package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.Item;
import com.example.demo.domain.Work;
import com.example.demo.service.ItemService;

@Controller
public class shiftController {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
	@RequestMapping(value = "/newwork",method = RequestMethod.GET)
	public String newWork(Model model) {
		model.addAttribute("newWork", new Work());
		return "newwork";
	}

	@PostMapping(value = "/newwork")
	public String createWork(@Validated Work work, BindingResult error, Model model) {
		if (error.hasErrors()) {
			return "index";
		}
		System.out.println(work.getName());
		System.out.println(work.getHpay());
		return "index";
	}
}
