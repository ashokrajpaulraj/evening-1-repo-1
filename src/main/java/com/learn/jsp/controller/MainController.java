package com.learn.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.learn.jsp.model.Book;
import com.learn.jsp.service.BookService;

@Controller
public class MainController {

	@Autowired
	BookService bookService;
	
	//http://localhost:8080
	@GetMapping("/")
	public String homePage(ModelMap map) {
		List<Book> books = bookService.getAll();
		map.addAttribute("data", books); //the list of books will be available to JSP in the name of "data"
		return "home"; //home.jsp
	}
	
	@GetMapping("/add")
	public String showAddPage() {
		return "add"; //add.jsp
	}
	
	@GetMapping("/addbook")
	public String addNewBook(int id, String name, String author, ModelMap map) {
		
		bookService.add( Book.builder().id(id).name(name).author(author).build() );
		
		List<Book> books = bookService.getAll();
		map.addAttribute("data", books); //the list of books will be available to JSP in the name of "data"
		return "home"; //home.jsp
	}

	@GetMapping("/delete")
	public String deleteBook(int id, ModelMap map) {
		bookService.delete( Book.builder().id(id).build() );;
		
		List<Book> books = bookService.getAll();
		map.addAttribute("data", books); //the list of books will be available to JSP in the name of "data"
		return "home"; //home.jsp
	}
	
	
}
