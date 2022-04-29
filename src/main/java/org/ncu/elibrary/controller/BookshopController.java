package org.ncu.elibrary.controller;

import java.util.List;
//
//import org.ncu.elibrary.dao.Ebookshopdao;
import org.ncu.elibrary.entity.Books;
import org.ncu.elibrary.service.EbookshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookshopController {
	/*
	 * @Autowired private Ebookshopdao ebookshopdao;
	 */
	
	@Autowired
	private EbookshopService ebookshopService;
	
	@ModelAttribute("books")
	public Books getBook() {
		 
		return new Books();
	}
	
	/* Controller mapping for showing the Book input form */
	//
	@GetMapping("/showBookForm")
	public String showStudentForm() {
		return "book-form";
	}
	
	//
	@RequestMapping("/showbooks")
	public String showBookList(Model m) {
		List<Books> bookslist = ebookshopService.loadBooks();
		m.addAttribute("books",bookslist);
		return "books-list";
		
	}
	
	
	
	
	//
	@PostMapping("/processForm")
	public String showProcessForm(@ModelAttribute("books") Books books) {
		if(ebookshopService.createRecord(books) == 1) {
			System.out.println("Records updated successfully");
		}else {
			System.out.println("Error Occurred!!");
		}
		
		return "confirmation";
	}
	
	//
	
	@GetMapping("/updateForm")
	public String showUpdateForm(@RequestParam("id")int bookid, @ModelAttribute("books") Books books, Model model) {
		
		System.out.println("Getting the student data for id: "+bookid);
		
		books = ebookshopService.getBook(bookid);
		/* send the student object to view */
		 model.addAttribute(books); 
		return "book-update-form";
	}
	
	/* Controller mapping for processing the update operation */
	//
	@PostMapping("/processUpdate")
	public String processUpdateForm(@ModelAttribute("books") Books books) {
		
		if(ebookshopService.updateRecord(books) == 1) {
			System.out.println("Record update successfully!!");
		}else {
			System.out.println("Error!!!");
		}
		return "confirmation";
	}
	
	/* Controller mapping for processing the delete operation */
	//
	@GetMapping("/deletebooks")
	public String deleteStudent(@RequestParam("id")int id) {
		ebookshopService.deleteBook(id);
		return "redirect:/showbooks";
	}
	//
	@RequestMapping("/searchbooks")
	public String SearchBooks() {
		return "book-search-form";
		
	}
	
	@PostMapping("/processBookForm")
	public String SearchBook(@RequestParam("title")String title,Model m) {
		List<Books> bookslist = ebookshopService.searchBooks(title);
		m.addAttribute("books",bookslist);
		return "searchedBook";
	}
	
	
}
