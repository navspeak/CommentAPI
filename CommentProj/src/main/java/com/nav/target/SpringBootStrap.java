package com.nav.target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.nav.target.domain.Comment;
import com.nav.target.services.CommentService;

@Component
public class SpringBootStrap implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	private CommentService commentService;
	public CommentService getCommentService() {
		return commentService;
	}

	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		loadInitialComments();
		
	}

	public void loadInitialComments() {
        Comment comment1 = new Comment();
        comment1.setText("This is a kosher comment. Respectful and descent");
        commentService.saveOrUpdate(comment1);

        
    }



}
