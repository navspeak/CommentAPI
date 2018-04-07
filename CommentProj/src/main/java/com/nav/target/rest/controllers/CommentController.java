package com.nav.target.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nav.target.domain.Comment;
import com.nav.target.services.CommentService;


//TODO - Add swagger docket
// Get /comments => returns all comments
// POST /comments 
//    JSON Body with existing id will update a new comment
//    JSON Body with no id will add a new comment
//    JSON Body with
@RestController
@RequestMapping("/comments")
public class CommentController {
	@Autowired
	private CommentService commentService;

	/**
	 * Get all comments
	 */
	@GetMapping({"","/"})
	List<Comment> listAll(){
		return (List<Comment>) commentService.listAll();
	}

	@GetMapping("/{id}")
	Comment getById(@PathVariable int id){
		return commentService.getById(id);
	}

	/**
	 * Update or insert a new comment
	 */
	@PostMapping
	Comment saveOrUpdate(@RequestBody Comment comment){
		return commentService.saveOrUpdate(comment);
	}

	@DeleteMapping
	void delete(@PathVariable int id){
		commentService.delete(id);
	}
}
